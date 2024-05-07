//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[FeatureType](index.md)

# FeatureType

[androidJvm]\
enum [FeatureType](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[FeatureType](index.md)&gt; 

Features/capabilities supported by BillingClient.isFeatureSupported(String).

## Entries

| | |
|---|---|
| [ALTERNATIVE_BILLING_ONLY](-a-l-t-e-r-n-a-t-i-v-e_-b-i-l-l-i-n-g_-o-n-l-y/index.md) | [androidJvm]<br>[ALTERNATIVE_BILLING_ONLY](-a-l-t-e-r-n-a-t-i-v-e_-b-i-l-l-i-n-g_-o-n-l-y/index.md)<br>Alternative billing only. |
| [BILLING_CONFIG](-b-i-l-l-i-n-g_-c-o-n-f-i-g/index.md) | [androidJvm]<br>[BILLING_CONFIG](-b-i-l-l-i-n-g_-c-o-n-f-i-g/index.md)<br>Get billing config. |
| [IN_APP_MESSAGING](-i-n_-a-p-p_-m-e-s-s-a-g-i-n-g/index.md) | [androidJvm]<br>[IN_APP_MESSAGING](-i-n_-a-p-p_-m-e-s-s-a-g-i-n-g/index.md)<br>Show in-app messages. |
| [PRICE_CHANGE_CONFIRMATION](-p-r-i-c-e_-c-h-a-n-g-e_-c-o-n-f-i-r-m-a-t-i-o-n/index.md) | [androidJvm]<br>[PRICE_CHANGE_CONFIRMATION](-p-r-i-c-e_-c-h-a-n-g-e_-c-o-n-f-i-r-m-a-t-i-o-n/index.md)<br>Launch a price change confirmation flow. |
| [PRODUCT_DETAILS](-p-r-o-d-u-c-t_-d-e-t-a-i-l-s/index.md) | [androidJvm]<br>[PRODUCT_DETAILS](-p-r-o-d-u-c-t_-d-e-t-a-i-l-s/index.md)<br>Support for querying and purchasing in-app products. |
| [SUBSCRIPTIONS](-s-u-b-s-c-r-i-p-t-i-o-n-s/index.md) | [androidJvm]<br>[SUBSCRIPTIONS](-s-u-b-s-c-r-i-p-t-i-o-n-s/index.md)<br>Purchase/query for subscriptions. |
| [SUBSCRIPTIONS_UPDATE](-s-u-b-s-c-r-i-p-t-i-o-n-s_-u-p-d-a-t-e/index.md) | [androidJvm]<br>[SUBSCRIPTIONS_UPDATE](-s-u-b-s-c-r-i-p-t-i-o-n-s_-u-p-d-a-t-e/index.md)<br>Subscriptions update/replace. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[FeatureType](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [normalizedType](normalized-type.md) | [androidJvm]<br>val [normalizedType](normalized-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [FeatureType](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[FeatureType](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
