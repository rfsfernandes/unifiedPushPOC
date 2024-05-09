//[billing](../../../index.md)/[com.faa.billing.core.api.data.purchase](../index.md)/[PurchasesResult](index.md)

# PurchasesResult

data class [PurchasesResult](index.md)(val billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), val purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;)

Result list and response code for BillingClient.queryPurchases method.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md) Result of the operation. |
| purchases | [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) Returns the list of [Purchase](../../com.faa.billing.core.api/-purchase/index.md). |

## Constructors

| | |
|---|---|
| [PurchasesResult](-purchases-result.md) | [androidJvm]<br>constructor(billingResponseCode: [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md), purchases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [billingResponseCode](billing-response-code.md) | [androidJvm]<br>val [billingResponseCode](billing-response-code.md): [BillingResponseCode](../../com.faa.billing.core.api/-billing-response-code/index.md) |
| [purchases](purchases.md) | [androidJvm]<br>val [purchases](purchases.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Purchase](../../com.faa.billing.core.api/-purchase/index.md)&gt; |
