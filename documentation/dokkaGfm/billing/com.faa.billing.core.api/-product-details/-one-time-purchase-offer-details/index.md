//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[ProductDetails](../index.md)/[OneTimePurchaseOfferDetails](index.md)

# OneTimePurchaseOfferDetails

[androidJvm]\
@Serializable

data class [OneTimePurchaseOfferDetails](index.md)

Represents the offer details to buy an one-time purchase product.

## Properties

| Name | Summary |
|---|---|
| [formattedPrice](formatted-price.md) | [androidJvm]<br>val [formattedPrice](formatted-price.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Formatted price for the payment, including its currency sign. |
| [priceAmountMicros](price-amount-micros.md) | [androidJvm]<br>val [priceAmountMicros](price-amount-micros.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The price for the payment in micro-units, where 1,000,000 micro-units equal one unit of the currency. |
| [priceCurrencyCode](price-currency-code.md) | [androidJvm]<br>val [priceCurrencyCode](price-currency-code.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>ISO 4217 currency code for price. |
