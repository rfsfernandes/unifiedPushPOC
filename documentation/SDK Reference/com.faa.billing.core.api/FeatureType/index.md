//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[FeatureType](index.md)

# FeatureType

\
enum [FeatureType](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[FeatureType](index.md)&gt; 

Features/capabilities supported by BillingClient.isFeatureSupported(String).

## Entries

| | |
|---|---|
| [ALTERNATIVE_BILLING_ONLY](ALTERNATIVE_BILLING_ONLY/index.md) | [ALTERNATIVE_BILLING_ONLY](ALTERNATIVE_BILLING_ONLY/index.md)<br>Alternative billing only. |
| [BILLING_CONFIG](BILLING_CONFIG/index.md) | [BILLING_CONFIG](BILLING_CONFIG/index.md)<br>Get billing config. |
| [IN_APP_MESSAGING](IN_APP_MESSAGING/index.md) | [IN_APP_MESSAGING](IN_APP_MESSAGING/index.md)<br>Show in-app messages. |
| [PRICE_CHANGE_CONFIRMATION](PRICE_CHANGE_CONFIRMATION/index.md) | [PRICE_CHANGE_CONFIRMATION](PRICE_CHANGE_CONFIRMATION/index.md)<br>Launch a price change confirmation flow. |
| [PRODUCT_DETAILS](PRODUCT_DETAILS/index.md) | [PRODUCT_DETAILS](PRODUCT_DETAILS/index.md)<br>Support for querying and purchasing in-app products. |
| [SUBSCRIPTIONS](SUBS-c-r-i-p-t-i-o-n-s/index.md) | [SUBSCRIPTIONS](SUBS-c-r-i-p-t-i-o-n-s/index.md)<br>Purchase/query for subscriptions. |
| [SUBSCRIPTIONS_UPDATE](SUBS-c-r-i-p-t-i-o-n-s_-u-p-d-a-t-e/index.md) | [SUBSCRIPTIONS_UPDATE](SUBS-c-r-i-p-t-i-o-n-s_-u-p-d-a-t-e/index.md)<br>Subscriptions update/replace. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[FeatureType](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [normalizedType](normalized-type.md) | val [normalizedType](normalized-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [FeatureType](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[FeatureType](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
