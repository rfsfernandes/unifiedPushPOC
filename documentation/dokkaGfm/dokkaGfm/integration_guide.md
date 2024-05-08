---
title: Integration Guide
category: 6634bdbe37990000692cca98
---

# {WIP}  Generic  FAA  Payment  Solution  >  In-App  SDK  v2

## Data  Models

### <a name="tag-product-type"></a>ProductType
Supported  Product  types.

![Product type](./images/product-type.jpeg)
> [!WARNING]
> Subscriptions are currently not supported.
<br>
-----------

### <a name="tag-feature-type"></a>FeatureType
Features/capabilities  supported  by  isFeaturedAvailable.

| **Property** | **Description** |
| --- | --- |
| ALTERNATIVE\_BILLING\_ONLY | Alternative  billing  only. |
| BILLING_CONFIG | Get  billing  config. |
| IN\_APP\_MESSAGING | Show  in-app  messages. |
| PRICE\_CHANGE\_CONFIRMATION | Launch  a  price  change  confirmation  flow. |
| PRODUCT_DETAILS | Support  for  querying  and  purchasing  in-app  items. |
| SUBSCRIPTIONS | Purchase/query  for  subscriptions. |
| SUBSCRIPTIONS_UPDATE | Subscriptions  update/replace. |

### BillingResponseCode

Possible  response  codes.

![BillingResponseCode](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/billing-response.jpeg?raw=true)  

| **Property** | **Description** |
| --- | --- |
| FEATURE\_NOT\_SUPPORTED | The  requested  feature  is  not  supported  by  the  Play  Store  on  the  current  device. |
| SERVICE_DISCONNECTED | The  app  is  not  connected  to  FAA’s  Payment. |
| OK  | Success. |
| USER_CANCELED | Transaction  was  canceled  by  the  user. |
| SERVICE_UNAVAILABLE | The  service  is  currently  unavailable. |
| BILLING_UNAVAILABLE | A  user  billing  error  occurred  during  processing. |
| ITEM_UNAVAILABLE | The  requested  product  is  not  available  for  purchase. |
| DEVELOPER_ERROR | Error  resulting  from  incorrect  usage  of  the  API. |
| ERROR | Fatal  error  during  the API  action. |
| ITEM\_ALREADY\_OWNED | The  purchase  failed  because  the  item  is  already  owned. |
| ITEM\_NOT\_OWNED | Requested  action  on  the  item  failed  since  it  is  not  owned  by  the  user. |
| NETWORK_ERROR | A  network  error  occurred  during  the  operation. |

  
### PurchaseState

Possible  purchase  states.

![purchase state](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/purchase-state.jpeg?raw=true)  

| **Value** | **Description** |
| --- | --- |
| UNSPECIFIED_STATE | Represents  an  unspecified  state  of  a  purchase. |
| PURCHASED | Indicates  that  the  purchase  has  been  completed. |
| PENDING | Indicates  that  the  purchase  is  pending  completion. |

### ProductDetails

Represents  the  details  of  a  one  time  or  subscription  product.

![Product details](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/product-details.jpeg?raw=true)  

| **Property** | **Description** |
| --- | --- |
| description | Returns  the  description  of  the  product. |
| name | Returns  the  name  of  the  product  being  sold. |
| productId | Returns  the  product's  Id. |
| productType | Returns  the  [ProductType](#tag-product-type) of  the  product. |
| title | Returns  the  title  of  the  product  being  sold. |
| oneTimePurchaseOfferDetails | Returns  the  offer  details  of  an  one-time  purchase  product. |
| subscriptionOfferDetails | Returns  a  list  containing  all  available  offers  to  purchase  a  subscription  product. |

#### OneTimePurchaseOffer

| **Property** | **Description** |
| --- | --- |
| formattedPrice | Returns  formatted  price  for  the  payment,  including  its  currency  sign. |
| priceAmountMicros | Returns the price for the payment in micro-units,  where  1,000,000  micro-units  equal  one  unit  of  the  currency. |
| priceCurrencyCode | Returns  ISO  4217  currency  code  for  price. |


#### ProductDetailsResult

![Product details result](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/product-details-result.png?raw=true)



#### Purchase

Represents  an  in-app  billing  purchase.

![Purchase](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/purchase.jpeg?raw=true)

| **Property** | **Description** |
| --- | --- |
| products | Returns  the  product  Ids. |
| purchaseState | Returns  one  of  Purchase.PurchaseState  indicating  the  state  of  the  purchase. |
| purchaseTime | Returns  the  time  the  product  was  purchased,  in  milliseconds  since  the  epoch  (Jan  1,  1970). |
| purchaseToken | A token  that  uniquely  identifies  a  purchase  for  a  given  item  and  user  pair. |
| accountIdentifiers | Returns  account  identifiers  that  were  provided  when  the  purchase  was  made. |
| developerPayload | Returns  the  payload  specified  when  the  purchase  was  acknowledged  or  consumed. |
| isAcknowledged | Indicates  whether  the  purchase  has  been  acknowledged. |
| isAutoRenewing | Indicates  whether  the  subscription  renews  automatically. |
| orderId | Returns  a  unique  order  identifier  for  the  transaction.<br>This  identifier  corresponds  to  the  order  ID. |
| originalJson | Returns  a  String  in  JSON  format  that  contains  details  about  the  purchase  order. |
| packageName | Returns  the  application  package  from  which  the  purchase  originated. |
| quantity | Returns  the  quantity  of  the  purchased  product. |
| signature | Returns String containing the signature of the  purchase  data  that  was  signed  with  the  private  key  of  the  developer.  The  data  signature  uses  the<br>RSASSA-PKCS1-v1_5  scheme. |

> [!WARNING]
> **accountIdentifiers** are currently not returned.

### PurchasesResult

Result  list  and  response  code  for  **queryPurchases**  method.

![Purchase result](https://github.com/faurecia-aptoide/android-inappbilling-sdk/blob/11b1c8c67a41d2c6fd1d927691db6bca978b8cf1/documentation/purchase-result.jpeg?raw=true)  

## Features

### Connect  to  Billing  client

#### Add  the  In-App  SDK  dependency
Add  the  In-App  SDK  dependency  in  your  app’s file ```build.gradle``` as  shown:
```kotlin
dependencies {
    def inapp_version = "2.0.2"

    implementation "com.faa.billingclient:InApp-SDK:$inapp_version"
}
```

#### Initialise  BillingClient

After adding  the In-App  SDK  dependency, a ```BillingClient```instance  needs  to  be  created.
```BillingClient``` is  the  entry  point  to  accessing the  In-App  SDK  features.  It  offers  convenience  methods  that  cover  many  common  tasks  associated  with  billing.

```BillingClient.Builder()``` is  used  to  configure  and  create a ```BillingClient```instance  tailored  to  the  needs  of  your  app,  as  well  as  for injecting  dependencies  of  In-App  SDK. It is required  that  the  following  parameters  are  passed  to  ```BillingClient.Builder```:

- ```context``` application  context  used  to  access  application  specific  resources

- ```purchaseUpdatelistener``` Sets  the  listener  through  which  notifications  for  purchases  updates  will  be  propagated  to.
```kotlin
 val billingClientSettings = BillingClientSettings.Builder()
            .setContext(context)
            .setPurchasesUpdatedListener(purchasesUpdatedListener)
            .build()
billingClient = BillingClient(billingClientSettings)
```
In  addition  to  these  parameters,  you  can  also  setfor  the  billing  client  to  start  operating  in  tester  mode.

> [!WARNING]
> ```testMode``` are currently not returned.

#### Connect  Payments  API
Once  you’ve  instantiated  the  ```BillingClient```,  you  need  to  establish  a  connection  with  the  Payments  Module  (which  can  be  Service  or  part of  another  App).  Call ```startConnection()``` to  connect  to  the  Payments  Module.  The  connection  establishment  process  may  take  several seconds.  In  order  to  be  notified  of  connection  state  changes,  i.e.,  if  the  connection  was  established  or  lost  and  to  react  accordingly,  it  is  necessary  to  provide an  implementation  of  ```BillingClientStateListener```:
```kotlin
billingClient.startConnection(object : BillingClientStateListener {
    override fun onBillingSetupFinished(billingResponseCode: BillingResponseCode) {
        if (billingResponseCode.responseCode ==  BillingResponseCode.OK) {
            // The BillingClient is ready. You can query purchases here.
        }
    }
    override fun onBillingServiceDisconnected() {
        // Try to restart the connection on the next request to
        // FAA Payments'system by calling the startConnection() method.
    }
})
```
It  may  happen  that  the  billing  client  fails  to  connect  or  loses  connection  to  the  Payments  Module,  in  which  case  you  can  retry  the  connection  using  [exponential  backoff](https://en.wikipedia.org/wiki/Exponential_backoff) policy:

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
          if (billingResponseCode.responseCode ==  BillingResponseCode.OK) {
              // The BillingClient is ready. You can query purchases here.
          } else if (billingResult.responseCode == BillingResponseCode.SERVICE_UNAVAILABLE) {
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

### Validate  supported  features
-----------------------------  
Some Android devices might have an older version of FAA’s Payments Service that doesn't support certain products types, such as  subscriptions. Before  your  app  enters  the billing  flow,  you  can  call ```isFeatureSupported()```  to  determine  whether  the device  supports  the  products you  want  to  sell. For  a  list  of product  types  that  can be  supported,  see  ```BillingClient.FeatureType```. You can  check  which  capabilities  the Billing service supports using  ```isFeatureSupported(featureType: FeatureType)``` . The possible available features are documented in  [FeatureType](#tag-feature-type).
> [!WARNING]
> Subscriptions are currently not supported.

### Fetching  product  details
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
    billingResult,
    productDetailsList ->
      // check billingResponseCode
      // process returned productDetailsList
}
```  
> [!NOTE]
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

### Fetching  purchases
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
> [!NOTE]
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
> [!WARNING]
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
### Launch  the  billing  flow
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

![Purchase confirmation](data:image/png;base64,data:image/jpeg;base64,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)  

> [!NOTE]
> The UI showcased here will vary depending on the environment (OEM) where the purchases are taking place.
------------------------


## Acknowledging purchases

After granting entitlement, your app must then acknowledge the purchase. This acknowledgement communicates to the Payment Services that you have granted entitlement for the purchase. Acknowledging of purchases should be performed when you are processing purchases retrieved by ```BillingClient.queryPurchases()``` or from ```PurchasesUpdatedListener``` (see [Fetching Purchases](#fetching-purchases)).

The process to grant entitlement and acknowledge the purchase depends on whether the purchase is a consumable or a non-consumable.
<br>

### Non-Consumables
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

### Consumables
For consumables, use consumePurchase() from the In-App SDK. This method fulfils the acknowledgement requirement and indicate that your app has granted entitlement to the user. These methods also enable your app to make the one-time product corresponding to the input purchase token available for repurchase. With ```consumePurchase()``` you must also pass an object that implements the ```ConsumeResponseListener interface```. This object handles the result of the consumption operation. You can override the ```onConsumeResponse()``` method, which the In-App SDK calls when the operation is complete.  
The following example illustrates consuming a product using the associated purchase token:
```kotlin
suspend fun handlePurchase(purchase: Purchase) {
    // Purchase retrieved from BillingClient#queryPurchasesAsync or your PurchasesUpdatedListener.
    val purchase : Purchase = ...;

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

### Verifying purchase integrity

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
