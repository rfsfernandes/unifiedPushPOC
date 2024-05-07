//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase.query](../index.md)/[PurchasesResponseListener](index.md)/[onQueryPurchasesResponse](on-query-purchases-response.md)

# onQueryPurchasesResponse

[androidJvm]\
abstract fun [onQueryPurchasesResponse](on-query-purchases-response.md)(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;)

Called to notify that the query purchases operation has finished.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md): Result of the query. |
| purchases | [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) List of purchases. |
