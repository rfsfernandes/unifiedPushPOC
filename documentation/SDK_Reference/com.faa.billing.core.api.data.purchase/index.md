//[billing](../../index.md)/[com.faa.billing.core.api.data.purchase](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [PurchasesResult](PurchasesResult/index.md) | data class [PurchasesResult](PurchasesResult/index.md)(val billingResponseCode: [BillingResponseCode](../com.faa.billing.core.api/BillingResponseCode/index.md), val purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../com.faa.billing.core.api/Purchase/index.md)&gt;)<br>Result list and response code for BillingClient.queryPurchases method. |
| [PurchasesUpdatedListener](PurchasesUpdatedListener/index.md) | fun interface [PurchasesUpdatedListener](PurchasesUpdatedListener/index.md)<br>Listener interface for purchase updates which happen when, for example, the user buys something within the app. |
