//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[ProductDetails](../index.md)/[PricingPhase](index.md)

# PricingPhase

\
@Serializable

data class [PricingPhase](index.md)

Represents a pricing phase, describing how a user pays at a point in time.

## Properties

| Name | Summary |
|---|---|
| [billingCycleCount](billing-cycle-count.md) | val [billingCycleCount](billing-cycle-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of cycles for which the billing period is applied. |
| [billingPeriod](billing-period.md) | val [billingPeriod](billing-period.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Billing period for which the given price applies, specified in ISO 8601 format. |
| [formattedPrice](formatted-price.md) | val [formattedPrice](formatted-price.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Formatted price for the payment cycle, including its currency sign. |
| [priceAmountMicros](price-amount-micros.md) | val [priceAmountMicros](price-amount-micros.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the price for the payment cycle in micro-units, where 1,000,000 micro-units equal one unit of the currency. |
| [priceCurrencyCode](price-currency-code.md) | val [priceCurrencyCode](price-currency-code.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns ISO 4217 currency code for price. |
| [recurrenceMode](recurrence-mode.md) | val [recurrenceMode](recurrence-mode.md): [ProductDetails.RecurrenceMode](../RecurrenceMode/index.md)<br>Returns [ProductDetails.RecurrenceMode](../RecurrenceMode/index.md) for the pricing phase. |
