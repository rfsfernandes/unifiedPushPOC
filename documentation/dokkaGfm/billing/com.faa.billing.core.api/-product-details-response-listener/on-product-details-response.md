//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ProductDetailsResponseListener](index.md)/[onProductDetailsResponse](on-product-details-response.md)

# onProductDetailsResponse

[androidJvm]\
abstract fun [onProductDetailsResponse](on-product-details-response.md)(billingResponseCode: [BillingResponseCode](../-billing-response-code/index.md), productDetailsList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProductDetails](../-product-details/index.md)&gt;)

Called to provide the result of the query for product details.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../-billing-response-code/index.md) Result of the query. Set to [ITEM_UNAVAILABLE](../-billing-response-code/-i-t-e-m_-u-n-a-v-a-i-l-a-b-l-e/index.md) if no product details are found. |
| productDetailsList | List of [ProductDetails](../-product-details/index.md). |
