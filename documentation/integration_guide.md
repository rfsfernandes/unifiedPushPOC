---
title: In-App SDK - Integration Guide
---

# Connect  to  Billing  client

## Add In-App SDK’s maven repository
Add the In-App SDK's maven repository to your project's ```build.gradle``` or ```setting.gradle```.
```
allprojects {
  repositories {
    maven {
      url TBD
      artifactUrls mavenCentral().url
      credentials {
        username System.env.CODEARTIFACT_USERNAME
        password System.env.CODEARTIFACT_AUTH_TOKEN
      }
    }
  }
}
```
> URL to be updated.


## Add  the  In-App  SDK  dependency
Add  the  In-App  SDK  dependency  in  your  app’s file ```build.gradle``` as  shown:
```kotlin
dependencies {
    def inapp_version = "2.0.2"

    implementation "com.faa.billingclient:InApp-SDK:$inapp_version"
}
```

## Initialise  BillingClient

After adding  the In-App  SDK  dependency, a ```BillingClient```instance  needs  to  be  created.
```BillingClient``` is  the  entry  point  to  accessing the  In-App  SDK  features.  It  offers  convenience  methods  that  cover  many  common  tasks  associated  with  billing.

```BillingClient.Builder()``` is  used  to  configure  and  create a ```BillingClient```instance  tailored  to  the  needs  of  your  app,  as  well  as  for injecting  dependencies  of  In-App  SDK. It is required  that  the  following  parameters  are  passed  to  ```BillingClient.Builder```:

- ```context``` Application  context  used  to  access  application  specific  resources

- ```purchaseUpdatelistener``` Sets  the  listener  through  which  notifications  for  purchases  updates  will  be  propagated  to.
```kotlin
val billingClientSettings = BillingClientSettings.Builder()
            .setContext(context)
            .setPurchasesUpdatedListener(purchasesUpdatedListener)
            .build()
billingClient = BillingClient(billingClientSettings)
```
In  addition  to  these  parameters,  you  can  also  set ```testMode``` for  the  billing  client  to  start  operating  in  tester  mode.

| ```testMode``` is currently not supported. |
|--------------------------------------------|


## Connect  Payments  Service
Once  you’ve  instantiated  the  ```BillingClient```,  you  need  to  establish  a  connection  with  FAA’s Payment Service. To start the connection call ```startConnection()```.  The  connection  establishment  process  may  take  several seconds.  In  order  to  be  notified  of  connection  state  changes,  i.e.,  if  the  connection  was  established  or  lost  and  to  react  accordingly,  it  is  necessary  to  provide an  implementation  of  ```BillingClientStateListener```:
```kotlin
billingClient.startConnection(object : BillingClientStateListener {
    override fun onBillingSetupFinished(billingResponseCode: BillingResponseCode) {
        if (billingResponseCode ==  BillingResponseCode.OK) {
            // The BillingClient is ready. You can query purchases here.
        }
    }
    override fun onBillingServiceDisconnected() {
        // Try to restart the connection on the next request to
        // FAA Payments'system by calling the startConnection() method.
    }
})
```
It  may  happen  that  the  billing  client  fails  to  connect  or  loses  connection  to  FAA's Payment Service,  in  which  case  you  can  retry  the  connection  using  [exponential  backoff](https://en.wikipedia.org/wiki/Exponential_backoff) policy:

```kotlin
class MainActivity : AppCompatActivity() {

  companion object MA {
      const val TAG = "MainActivity"
      const val MAX_WAITING_MILLIS = 900_000L // 15 minutes in milliseconds
  }

  private lateinit var billingClient: BillingClient

  private var retryInterval: Long = 1000

  private val billingClientStateListener = object : BillingClientStateListener {
      override fun onBillingSetupFinished(billingResponseCode: BillingResponseCode) {
          if (billingResponseCode ==  BillingResponseCode.OK) {
              // The BillingClient is ready. You can query purchases here.
          } else if (billingResponseCode == BillingResponseCode.SERVICE_UNAVAILABLE) {
              retryBillingServiceConnectionWithExponentialBackoff()
          }
      }
      override fun onBillingServiceDisconnected() {
          retryBillingServiceConnectionWithExponentialBackoff()
      }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    // Initiate BillingClient
    billingClient.startConnection()
  }
  
  //...
  private fun retryBillingServiceConnectionWithExponentialBackoff() {
      lifecycleScope.launch(Dispatchers.Main) {
          delay(retryInterval)
          Log.d(TAG, "onBillingSetupFinished: Failed to connect to billing service, retrying")
          billingClient.startConnection(billingClientStateListener)
          retryInterval = min(2 * retryInterval, MAX_WAITING_MILLIS)
      }
  }
}
```   

# Validate  supported  features
-----------------------------  
Some Android devices might have an older version of FAA’s Payments Service that doesn't support certain products types, such as  subscriptions. Before  your  app  enters  the billing  flow,  you  can  call ```isFeatureSupported()```  to  determine  whether  the device  supports  the  products you  want  to  sell. For  a  list  of product  types  that  can be  supported,  see  ```BillingClient.FeatureType```. You can  check  which  capabilities  the Billing service supports using  ```isFeatureSupported(featureType: FeatureType)``` . The possible available features are documented in  [FeatureType](#tag-feature-type).

> Subscriptions are currently not supported.

# Fetching  product  details
--------------------------

After  you  have  established  a  connection  to  payments  module,  you  are  ready  to  query  for  your  available  products  and  display  them  to  your  users.
Querying  for  product  details  is  an  important  step  before  displaying  your  products  to  your  users,  as  it  returns  localized  product  information.  To  query  for  in-app  product  details,  call  ```queryProductDetails()``` .

To handle  the  result  of  the  asynchronous  operation,  you  must  also specify  a  listener  which  implements  the ```ProductDetailsResponseListener```interface.  You  can  then  override  ```onProductDetailsResponse()```,  which  notifies  the  listener  when  the  query  finishes,  as  shown  in  the  following example:
```kotlin
val queryProductDetailsParams =
    QueryProductDetailsParams.newBuilder()
        .setProductList(
            ImmutableList.of(
                Product.newBuilder()
                    .setProductId("product_id_example")
                    .setProductType(ProductType.IN_APP)
                    .build()))
        .build()

billingClient.queryProductDetails(queryProductDetailsParams) { 
    billingResponseCode,
    productDetailsList ->
      // check billingResponseCode
      // process returned productDetailsList
}
```
> If you are using coroutines you can also call the extension ```BillingClient.queryProductDetails()``` in which case you only need to pass an instance of ```QueryProductDetailsParams```. This method will return an instance of ```ProductDetailsResult```.

```kotlin
val queryProductDetailsParams =
    QueryProductDetailsParams.newBuilder()
        .setProductList(
            ImmutableList.of(
                Product.newBuilder()
                    .setProductId("product_id_example")
                    .setProductType(ProductType.IN_APP)
                    .build()))
        .build()
        
val result = billingClient.queryProductDetails(queryProductDetailsParams)
if (result.billingResponseCode == BillingResponseCode.OK) {
    // process returned productDetailsList
} else {
    Log.e(TAG, "error while fetching product details, ${result.billingResponseCode}")
}
```

# Fetching  purchases
-------------------
Every  time  the  user  completes  a  billing  flow  successfully  its  purchases  are  updated.  To  receive  updates  on  purchases  call ```setListener```  on  the  ```BillingClient.Builder```  ,  passing a reference  to a  ```PurchasesUpdatedListener``` :
```kotlin
private val purchasesUpdatedListener =
   PurchasesUpdatedListener { billingResponseCode, purchases ->
       // To be implemented in a later section.
   }

private var billingClient = BillingClient.Builder()
   .setContext(context)
   .setListener(purchasesUpdatedListener)
   .build()
```
Furthermore,  to  cover  the  scenario  where  network  issues  prevent  the  app  from  receiving  updates  or  the  user  has  completed  the  billing  flow in  another  device,  it  is  recommended  that  you  call ```BillingClient.queryPurchases()``` in ``` onResume()```,  passing  a  reference  of ```QueryPurchasesParams``` and  ```PurchasesResponseListener```.  In  the  bellow  example  it  is  shown  how  to  fetch  purchases  using ```queryPurchases()```:

```kotlin
val params = QueryPurchasesParams.Builder()
               .setProductType(ProductType.IN_APP)
               .build()

billingClient.queryPurchases(params){ billingResponseCode, purchases -> 
    // process purchases
}
```
> If you are using coroutines you can also call the extension ```BillingClient.queryPurchases()``` in which case you only need to pass an instance of ```QueryPurchasesParams```. This method will return an instance of ```PurchasesResult```.
```kotlin
val params = QueryPurchasesParams.Builder()
               .setProductType(ProductType.IN_APP)
               .build()

val result = billingClient.queryPurchases(params)
if (result.billingResponseCode == BillingResponseCode.OK) {
    processPurchases(result.purchases)
} else {
    Log.e(TAG, "error while fetching purchases, ${result.billingResponseCode}")
}
```
> When calling ```queryPurchases()```in ```onResume()``` make user you check if the BillingClient ```isReady() ```beforehand.

When a billing flow is complete this will trigger a call to ```PurchasesUpdatedListener.onPurchasesUpdated()``` as well as to the  ```onResume()``` . To avoid processing the same purchases twice, you’ll need to keep track if purchases are being processed. In the example  bellow we  are  using an  [AtomicBoolean](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicBoolean.html) to keep  track  if  processing is  ongoing  before starting  to  process  the updated  purchases:

```kotlin
private val arePurchasesBeingProcessed = AtomicBoolean(false)

override fun onPurchasesUpdated(
    billingResponseCode: BillingResponseCode,
    purchases: List<Purchase>
) {
    if (arePurchasesBeingProcessed.getAndSet(true)) return
    if (billingResponseCode == BillingResponseCode.OK) {
        processPurchases(purchases)
    } else {
        arePurchasesBeingProcessed.set(false)
        Log.e(TAG, "error while updating purchases, $billingResponseCode")
    }
}
```
--------------------------
# Launch  the  billing  flow
Invoke the ```launchBillingFlow()``` method from the main thread in order to initiate a purchase request. This method takes a reference to a ```BillingFlowParams``` object which contains the relevant ProductDetails object obtained from calling ```queryProductDetails()```. You can use the ```BillingFlowParams.Builder``` class to generate a ```BillingFlowParams``` object.

```kotlin
val productDetailsParams = BillingFlowParams
            .ProductDetailsParams.Builder()
            .setProductDetails(productDetails)
            .build()

val billingFlowParams = BillingFlowParams.Builder()
            .setProductDetailsParams(productDetailsParams)
            .build()

val billingResponseCode = billingClient.launchBillingFlow(billingFlowParams)
```

When  launchBillingFlow()  is  called  successfully,  the  system  shows  a  billing  dialog:
![Confirm purchase](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/confirm-purchase.png?raw=true)

The Payments service calls ```onPurchasesUpdated()``` to deliver the result of the purchase operation to a listener that implements the ```PurchasesUpdatedListener interface```. The listener is specified using the ```setListener()``` method when you [initialized your client](#initialise-billingclient).

A successful purchase generates a purchase success screen:

![Purchase confirmation](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/purchase-confirmation.png?raw=true)  

> The UI showcased here will vary depending on the environment (OEM) where the purchases are taking place.
------------------------


# Acknowledging purchases

After granting entitlement, your app must then acknowledge the purchase. This acknowledgement communicates to the Payment Services that you have granted entitlement for the purchase. Acknowledging of purchases should be performed when you are processing purchases retrieved by ```BillingClient.queryPurchases()``` or from ```PurchasesUpdatedListener``` (see [Fetching Purchases](#fetching-purchases)).

The process to grant entitlement and acknowledge the purchase depends on whether the purchase is a consumable or a non-consumable.
<br>

## Non-Consumables
For non-consumable products, use ```BillingClient.acknowledgePurchase()``` from the In-App SDK in your app. Before acknowledging a purchase, make sure you check whether it was already acknowledged by using the ```isAcknowledged()``` method.  
The following example shows how to acknowledge a purchase using the In-App SDK:
```kotlin
val client: BillingClient = ...
val acknowledgePurchaseResponseListener: AcknowledgePurchaseResponseListener = ...

suspend fun handlePurchase(purchase: Purchase) {
    if (purchase.purchaseState === PurchaseState.PURCHASED) {
        if (!purchase.isAcknowledged) {
            val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                    .setPurchaseToken(purchase.purchaseToken)
            client.acknowledgePurchase(acknowledgePurchaseParams.build()) { responseCode ->
                // handle acknowledge result
            }
        }
     }
}
```

## Consumables
For consumables, use consumePurchase() from the In-App SDK. This method fulfils the acknowledgement requirement and indicate that your app has granted entitlement to the user. These methods also enable your app to make the one-time product corresponding to the input purchase token available for repurchase. With ```consumePurchase()``` you must also pass an object that implements the ```ConsumeResponseListener interface```. This object handles the result of the consumption operation. You can override the ```onConsumeResponse()``` method, which the In-App SDK calls when the operation is complete.  
The following example illustrates consuming a product using the associated purchase token:
```kotlin
suspend fun handlePurchase(purchase: Purchase) {
    // Purchase retrieved from BillingClient#queryPurchasesAsync or your PurchasesUpdatedListener.
    val purchase : Purchase = ...

    // Verify the purchase.
    // Ensure entitlement was not already granted for this purchaseToken.
    // Grant entitlement to the user.

    val consumePurchaseParams =
        ConsumePurchaseParams.newBuilder()
            .setPurchaseToken(purchase.getPurchaseToken())
            .build()
    val consumeResult = withContext(Dispatchers.IO) {
        client.consumePurchase(consumeParams)
    }
}
```

## Verifying purchase integrity

To prevent fraudulent transactions, i.e., malicious actors tricking your app into acknowledging a purchase that never happened it is important to check the integrity of the data. Fortunately, all ```Purchase``` objects include a Base-64 encoded signature as well as the original Json used to generate the signature. It is then possible to verify the signature against the original Json data signed by the In-App purchases SDK Public key generated in the developer’s portal. To do this first we need to load the public key as such:
```kotlin
const val KEY_FACTORY_ALGORITHM = "RSA"

private val publicKey by lazy {
    try {
        val decodedKey = Base64.decode(IN_APP_SDK_PUBLIC_KEY, Base64.DEFAULT)
        val keyFactory = KeyFactory.getInstance(KEY_FACTORY_ALGORITHM)
        return@lazy keyFactory.generatePublic(X509EncodedKeySpec(decodedKey))
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e);
    } catch (e: InvalidKeySpecException) {
        Log.e(TAG, "Invalid key specification.");
        throw IllegalArgumentException(e);
    }
}
```

After that we decode Base-64 encoded signature

```kotlin
val signatureBytes = try {
      Base64.decode(encodedSignature, Base64.DEFAULT)
} catch (e: java.lang.IllegalArgumentException) {
    Log.e(TAG, "Base64 decoding failed.")
    return false
}
```

And then we verify the signature against the original Json signed with the public key:

```kotlin
try {
    val signature: Signature = Signature.getInstance(signatureAlgorithm)
    signature.initVerify(publicKey)
    signature.update(signedData.toByteArray())
    if (!signature.verify(signatureBytes)) {
        Log.e(TAG, "Signature verification failed.")
        return false
    }
    return true
} catch (e: NoSuchAlgorithmException) {
    Log.e(TAG, "NoSuchAlgorithmException.")
} catch (e: InvalidKeyException) {
    Log.e(TAG, "Invalid key specification.")
} catch (e: SignatureException) {
    Log.e(TAG, "Signature exception.")
}
return false
```

The full method for verifying the purchase can be found bellow:

```kotlin
private const val SIGNATURE_ALGORITHM = "SHA1withRSA"

fun verify(
    signedData: String,
    encodedSignature: String,
    signatureAlgorithm: String = SIGNATURE_ALGORITHM
) : Boolean {
    if (BuildConfig.IN_APP_SDK_PUBLIC_KEY.isBlank() ||
        signedData.isBlank() ||
        encodedSignature.isBlank()) {
        Log.e(TAG, "Purchase verification failed: missing data.")
        return false
    }

    val signatureBytes = try {
          Base64.decode(encodedSignature, Base64.DEFAULT)
    } catch (e: java.lang.IllegalArgumentException) {
        Log.e(TAG, "Base64 decoding failed.")
        return false
    }

    try {
        val signature: Signature = Signature.getInstance(signatureAlgorithm)
        signature.initVerify(publicKey)
        signature.update(signedData.toByteArray())
        if (!signature.verify(signatureBytes)) {
            Log.e(TAG, "Signature verification failed.")
            return false
        }
        return true
    } catch (e: NoSuchAlgorithmException) {
        Log.e(TAG, "NoSuchAlgorithmException.")
    } catch (e: InvalidKeyException) {
        Log.e(TAG, "Invalid key specification.")
    } catch (e: SignatureException) {
        Log.e(TAG, "Signature exception.")
    }
    return false
}
```

Where ```signedData``` is the original Json retrieved from ```Purchase.originalJson```, ```encodedSignature``` is retrieved by Purchase.signature and the ```signatureAlgorithm```, the algorithm used to generate the signature is ```SHA1withRSA```.

Next, when processing the purchases retrieved by ```BillingClient.queryPurchases```, you can verity the integrity of the purchases as such:

```kotlin
verify(purchase.originalJson, purchase.signature)
```
