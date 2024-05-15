//[billing](../../index.md)/[com.faa.billing.core.api](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AccountIdentifiers](-account-identifiers/index.md) | [androidJvm]<br>@Serializable<br>data class [AccountIdentifiers](-account-identifiers/index.md)<br>Account identifiers that were specified when the purchase was made. |
| [AcknowledgePurchaseParams](-acknowledge-purchase-params/index.md) | [androidJvm]<br>class [AcknowledgePurchaseParams](-acknowledge-purchase-params/index.md)<br>Parameters to acknowledge a purchase. See BillingClient.acknowledgePurchase(AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener). |
| [AcknowledgePurchaseResponseListener](-acknowledge-purchase-response-listener/index.md) | [androidJvm]<br>fun interface [AcknowledgePurchaseResponseListener](-acknowledge-purchase-response-listener/index.md)<br>Listener for the result of an acknowledge purchase request. |
| [BillingClient](-billing-client/index.md) | [androidJvm]<br>class [BillingClient](-billing-client/index.md) : BillingServiceConnectionDelegate, BillingDataSourceDelegate<br>Creates an instance. After creation, it will not yet be ready to use. You must perform setup by calling .startSetup and wait for setup to complete. This constructor does not block and is safe to call from a UI thread. |
| [BillingClientStateListener](-billing-client-state-listener/index.md) | [androidJvm]<br>interface [BillingClientStateListener](-billing-client-state-listener/index.md)<br>Callback for setup process. This listener's [onBillingSetupFinished(BillingResult)](-billing-client-state-listener/on-billing-setup-finished.md) method is called when the setup process is complete. |
| [BillingFlowParams](-billing-flow-params/index.md) | [androidJvm]<br>class [BillingFlowParams](-billing-flow-params/index.md)<br>Created by Nuno Palma on 18/03/2024. |
| [BillingResponseCode](-billing-response-code/index.md) | [androidJvm]<br>enum [BillingResponseCode](-billing-response-code/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[BillingResponseCode](-billing-response-code/index.md)&gt; <br>Possible response codes. |
| [ConnectionState](-connection-state/index.md) | [androidJvm]<br>enum [ConnectionState](-connection-state/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ConnectionState](-connection-state/index.md)&gt; <br>Connection state of billing client. |
| [ConsumePurchaseParams](-consume-purchase-params/index.md) | [androidJvm]<br>class [ConsumePurchaseParams](-consume-purchase-params/index.md)<br>Parameters to consume a purchase. See BillingClient#consumePurchase(ConsumeParams, ConsumeResponseListener). |
| [ConsumePurchaseResponseListener](-consume-purchase-response-listener/index.md) | [androidJvm]<br>fun interface [ConsumePurchaseResponseListener](-consume-purchase-response-listener/index.md)<br>Callback that notifies when a consumption operation finishes. |
| [ConsumePurchaseResult](-consume-purchase-result/index.md) | [androidJvm]<br>data class [ConsumePurchaseResult](-consume-purchase-result/index.md) |
| [FeatureType](-feature-type/index.md) | [androidJvm]<br>enum [FeatureType](-feature-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[FeatureType](-feature-type/index.md)&gt; <br>Features/capabilities supported by BillingClient.isFeatureSupported(String). |
| [ProductDetails](-product-details/index.md) | [androidJvm]<br>@Serializable<br>data class [ProductDetails](-product-details/index.md)<br>Represents the details of a one time or subscription product. |
| [ProductDetailsResponseListener](-product-details-response-listener/index.md) | [androidJvm]<br>fun interface [ProductDetailsResponseListener](-product-details-response-listener/index.md)<br>Listener for the result of a product details query. |
| [ProductDetailsResult](-product-details-result/index.md) | [androidJvm]<br>data class [ProductDetailsResult](-product-details-result/index.md)(val billingResponseCode: [BillingResponseCode](-billing-response-code/index.md), val productDetailsList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProductDetails](-product-details/index.md)&gt;) |
| [ProductType](-product-type/index.md) | [androidJvm]<br>enum [ProductType](-product-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductType](-product-type/index.md)&gt; <br>Supported Product types. |
| [Purchase](-purchase/index.md) | [androidJvm]<br>@Serializable<br>data class [Purchase](-purchase/index.md)<br>This class represents a purchase with various attributes. |
| [QueryProductDetailsParams](-query-product-details-params/index.md) | [androidJvm]<br>class [QueryProductDetailsParams](-query-product-details-params/index.md)<br>Parameters to initiate a query for Product details queryProductDetails. |

## Functions

| Name | Summary |
|---|---|
| [acknowledgePurchase](acknowledge-purchase.md) | [androidJvm]<br>suspend fun [BillingClient](-billing-client/index.md).[acknowledgePurchase](acknowledge-purchase.md)(params: [AcknowledgePurchaseParams](-acknowledge-purchase-params/index.md)): [BillingResponseCode](-billing-response-code/index.md) |
| [consumePurchase](consume-purchase.md) | [androidJvm]<br>suspend fun [BillingClient](-billing-client/index.md).[consumePurchase](consume-purchase.md)(params: [ConsumePurchaseParams](-consume-purchase-params/index.md)): [BillingResponseCode](-billing-response-code/index.md) |
| [queryProductDetails](query-product-details.md) | [androidJvm]<br>suspend fun [BillingClient](-billing-client/index.md).[queryProductDetails](query-product-details.md)(params: [QueryProductDetailsParams](-query-product-details-params/index.md)): [ProductDetailsResult](-product-details-result/index.md) |
| [queryPurchases](query-purchases.md) | [androidJvm]<br>suspend fun [BillingClient](-billing-client/index.md).[queryPurchases](query-purchases.md)(params: [QueryPurchasesParams](../com.faa.billing.core.api.data.purchase.query/-query-purchases-params/index.md)): [PurchasesResult](../com.faa.billing.core.api.data.purchase/-purchases-result/index.md) |
