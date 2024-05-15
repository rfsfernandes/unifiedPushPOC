//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase](../index.md)/[PurchasesUpdatedListener](index.md)

# PurchasesUpdatedListener

[androidJvm]\
fun interface [PurchasesUpdatedListener](index.md)

Listener interface for purchase updates which happen when, for example, the user buys something within the app.

## Functions

| Name | Summary |
|---|---|
| [onPurchasesUpdated](on-purchases-updated.md) | [androidJvm]<br>abstract fun [onPurchasesUpdated](on-purchases-updated.md)(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;)<br>Implement this method to get notifications for purchases updates. |
