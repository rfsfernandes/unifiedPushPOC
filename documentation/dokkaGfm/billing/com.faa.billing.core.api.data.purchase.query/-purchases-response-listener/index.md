//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase.query](../index.md)/[PurchasesResponseListener](index.md)

# PurchasesResponseListener

[androidJvm]\
fun interface [PurchasesResponseListener](index.md)

Listener to a result of purchases query.

## Functions

| Name | Summary |
|---|---|
| [onQueryPurchasesResponse](on-query-purchases-response.md) | [androidJvm]<br>abstract fun [onQueryPurchasesResponse](on-query-purchases-response.md)(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;)<br>Called to notify that the query purchases operation has finished. |
