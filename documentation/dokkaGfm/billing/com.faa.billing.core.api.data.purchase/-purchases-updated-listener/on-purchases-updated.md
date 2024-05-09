//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase](../index.md)/[PurchasesUpdatedListener](index.md)/[onPurchasesUpdated](on-purchases-updated.md)

# onPurchasesUpdated

[androidJvm]\
abstract fun [onPurchasesUpdated](on-purchases-updated.md)(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;)

Implement this method to get notifications for purchases updates.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md): Result of the purchase update. [BillingResponseCode.ITEM_ALREADY_OWNED](../../com.faa.billing.core.api/-billing-response-code/-i-t-e-m_-a-l-r-e-a-d-y_-o-w-n-e-d/index.md) if the user already owns the item being purchased, [BillingResponseCode.ITEM_UNAVAILABLE](../../com.faa.billing.core.api/-billing-response-code/-i-t-e-m_-u-n-a-v-a-i-l-a-b-l-e/index.md) if the item is not available to be purchased, and [BillingResponseCode.USER_CANCELED](../../com.faa.billing.core.api/-billing-response-code/-u-s-e-r_-c-a-n-c-e-l-e-d/index.md) if the user dismissed the purchase flow. |
| purchases | [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) List of updated purchases if present. |
