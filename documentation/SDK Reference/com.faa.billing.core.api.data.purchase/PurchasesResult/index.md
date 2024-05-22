//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase](../index.md)/[PurchasesResult](index.md)

# PurchasesResult

data class [PurchasesResult](index.md)(val billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/BillingResponseCode/index.md), val purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/Purchase/index.md)&gt;)

Result list and response code for BillingClient.queryPurchases method.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../../com.faa.billing.core.api/BillingResponseCode/index.md) Result of the operation. |
| purchases | [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) Returns the list of [Purchase](../../com.faa.billing.core.api/Purchase/index.md). |

## Constructors

| | |
|---|---|
| [PurchasesResult](PurchasesResult.md) | constructor(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/BillingResponseCode/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/Purchase/index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [billingResponseCode](billing-response-code.md) | val [billingResponseCode](billing-response-code.md): [BillingResponseCode](../../com.faa.billing.core.api/BillingResponseCode/index.md) |
| [purchases](purchases.md) | val [purchases](purchases.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/Purchase/index.md)&gt; |
