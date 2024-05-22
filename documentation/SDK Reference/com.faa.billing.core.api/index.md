//[billing](../../index.md)/[com.faa.billing.core.api](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AccountIdentifiers](AccountIdentifiers/index.md) | @Serializable<br>data class [AccountIdentifiers](AccountIdentifiers/index.md)<br>Account identifiers that were specified when the purchase was made. |
| [AcknowledgePurchaseParams](AcknowledgePurchaseParams/index.md) | class [AcknowledgePurchaseParams](AcknowledgePurchaseParams/index.md)<br>Parameters to acknowledge a purchase. See BillingClient.acknowledgePurchase(AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener). |
| [AcknowledgePurchaseResponseListener](-acknowledgePurchase-response-listener/index.md) | fun interface [AcknowledgePurchaseResponseListener](-acknowledgePurchase-response-listener/index.md)<br>Listener for the result of an acknowledge purchase request. |
| [BillingClient](BillingClient/index.md) | class [BillingClient](BillingClient/index.md) : BillingServiceConnectionDelegate, BillingDataSourceDelegate<br>Creates an instance. After creation, it will not yet be ready to use. You must perform setup by calling .startSetup and wait for setup to complete. This constructor does not block and is safe to call from a UI thread. |
| [BillingClientStateListener](BillingClient-state-listener/index.md) | interface [BillingClientStateListener](BillingClient-state-listener/index.md)<br>Callback for setup process. This listener's [onBillingSetupFinished(BillingResult)](BillingClient-state-listener/on-billing-setup-finished.md) method is called when the setup process is complete. |
| [BillingFlowParams](BillingFlowParams/index.md) | class [BillingFlowParams](BillingFlowParams/index.md)<br>Created by Nuno Palma on 18/03/2024. |
| [BillingResponseCode](BillingResponseCode/index.md) | enum [BillingResponseCode](BillingResponseCode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[BillingResponseCode](BillingResponseCode/index.md)&gt; <br>Possible response codes. |
| [ConnectionState](ConnectionState/index.md) | enum [ConnectionState](ConnectionState/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ConnectionState](ConnectionState/index.md)&gt; <br>Connection state of billing client. |
| [ConsumePurchaseParams](-consumePurchase-params/index.md) | class [ConsumePurchaseParams](-consumePurchase-params/index.md)<br>Parameters to consume a purchase. See BillingClient#consumePurchase(ConsumeParams, ConsumeResponseListener). |
| [ConsumePurchaseResponseListener](-consumePurchase-response-listener/index.md) | fun interface [ConsumePurchaseResponseListener](-consumePurchase-response-listener/index.md)<br>Callback that notifies when a consumption operation finishes. |
| [ConsumePurchaseResult](ConsumePurchaseResult/index.md) | data class [ConsumePurchaseResult](ConsumePurchaseResult/index.md) |
| [FeatureType](FeatureType/index.md) | enum [FeatureType](FeatureType/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[FeatureType](FeatureType/index.md)&gt; <br>Features/capabilities supported by BillingClient.isFeatureSupported(String). |
| [ProductDetails](ProductDetails/index.md) | @Serializable<br>data class [ProductDetails](ProductDetails/index.md)<br>Represents the details of a one time or subscription product. |
| [ProductDetailsResponseListener](ProductDetailsResponseListener/index.md) | fun interface [ProductDetailsResponseListener](ProductDetailsResponseListener/index.md)<br>Listener for the result of a product details query. |
| [ProductDetailsResult](ProductDetails-result/index.md) | data class [ProductDetailsResult](ProductDetails-result/index.md)(val billingResponseCode: [BillingResponseCode](BillingResponseCode/index.md), val productDetailsList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProductDetails](ProductDetails/index.md)&gt;) |
| [ProductType](ProductType/index.md) | enum [ProductType](ProductType/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductType](ProductType/index.md)&gt; <br>Supported Product types. |
| [Purchase](Purchase/index.md) | @Serializable<br>data class [Purchase](Purchase/index.md)<br>This class represents a purchase with various attributes. |
| [QueryProductDetailsParams](-queryProductDetails-params/index.md) | class [QueryProductDetailsParams](-queryProductDetails-params/index.md)<br>Parameters to initiate a query for Product details queryProductDetails. |

## Functions

| Name | Summary |
|---|---|
| [acknowledgePurchase](acknowledgePurchase.md) | suspend fun [BillingClient](BillingClient/index.md).[acknowledgePurchase](acknowledgePurchase.md)(params: [AcknowledgePurchaseParams](AcknowledgePurchaseParams/index.md)): [BillingResponseCode](BillingResponseCode/index.md) |
| [consumePurchase](consumePurchase.md) | suspend fun [BillingClient](BillingClient/index.md).[consumePurchase](consumePurchase.md)(params: [ConsumePurchaseParams](-consumePurchase-params/index.md)): [BillingResponseCode](BillingResponseCode/index.md) |
| [queryProductDetails](queryProductDetails.md) | suspend fun [BillingClient](BillingClient/index.md).[queryProductDetails](queryProductDetails.md)(params: [QueryProductDetailsParams](-queryProductDetails-params/index.md)): [ProductDetailsResult](ProductDetails-result/index.md) |
| [queryPurchases](queryPurchases.md) | suspend fun [BillingClient](BillingClient/index.md).[queryPurchases](queryPurchases.md)(params: [QueryPurchasesParams](../com.faa.billing.core.api.data.purchase.query/QueryPurchasesParams/index.md)): [PurchasesResult](../com.faa.billing.core.api.data.purchase/PurchasesResult/index.md) |
