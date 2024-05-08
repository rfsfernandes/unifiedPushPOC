//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingResponseCode](index.md)

# BillingResponseCode

[androidJvm]\
enum [BillingResponseCode](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[BillingResponseCode](index.md)&gt; 

Possible response codes.

## Entries

| | |
|---|---|
| [FEATURE_NOT_SUPPORTED](-f-e-a-t-u-r-e_-n-o-t_-s-u-p-p-o-r-t-e-d/index.md) | [androidJvm]<br>[FEATURE_NOT_SUPPORTED](-f-e-a-t-u-r-e_-n-o-t_-s-u-p-p-o-r-t-e-d/index.md)<br>The requested feature is not supported by the payments service on the device. |
| [SERVICE_DISCONNECTED](-s-e-r-v-i-c-e_-d-i-s-c-o-n-n-e-c-t-e-d/index.md) | [androidJvm]<br>[SERVICE_DISCONNECTED](-s-e-r-v-i-c-e_-d-i-s-c-o-n-n-e-c-t-e-d/index.md)<br>The app is not connected to the Billing service via the In-App SDK. |
| [OK](-o-k/index.md) | [androidJvm]<br>[OK](-o-k/index.md)<br>Success. |
| [USER_CANCELED](-u-s-e-r_-c-a-n-c-e-l-e-d/index.md) | [androidJvm]<br>[USER_CANCELED](-u-s-e-r_-c-a-n-c-e-l-e-d/index.md)<br>Transaction was canceled by the user. |
| [SERVICE_UNAVAILABLE](-s-e-r-v-i-c-e_-u-n-a-v-a-i-l-a-b-l-e/index.md) | [androidJvm]<br>[SERVICE_UNAVAILABLE](-s-e-r-v-i-c-e_-u-n-a-v-a-i-l-a-b-l-e/index.md)<br>The service is currently unavailable. |
| [BILLING_UNAVAILABLE](-b-i-l-l-i-n-g_-u-n-a-v-a-i-l-a-b-l-e/index.md) | [androidJvm]<br>[BILLING_UNAVAILABLE](-b-i-l-l-i-n-g_-u-n-a-v-a-i-l-a-b-l-e/index.md)<br>A user billing error occurred during processing. |
| [ITEM_UNAVAILABLE](-i-t-e-m_-u-n-a-v-a-i-l-a-b-l-e/index.md) | [androidJvm]<br>[ITEM_UNAVAILABLE](-i-t-e-m_-u-n-a-v-a-i-l-a-b-l-e/index.md)<br>The requested product is not available for purchase. |
| [DEVELOPER_ERROR](-d-e-v-e-l-o-p-e-r_-e-r-r-o-r/index.md) | [androidJvm]<br>[DEVELOPER_ERROR](-d-e-v-e-l-o-p-e-r_-e-r-r-o-r/index.md)<br>Error resulting from incorrect usage of the API. |
| [ERROR](-e-r-r-o-r/index.md) | [androidJvm]<br>[ERROR](-e-r-r-o-r/index.md)<br>Fatal error during the API action. |
| [ITEM_ALREADY_OWNED](-i-t-e-m_-a-l-r-e-a-d-y_-o-w-n-e-d/index.md) | [androidJvm]<br>[ITEM_ALREADY_OWNED](-i-t-e-m_-a-l-r-e-a-d-y_-o-w-n-e-d/index.md)<br>The purchase failed because the item is already owned. |
| [ITEM_NOT_OWNED](-i-t-e-m_-n-o-t_-o-w-n-e-d/index.md) | [androidJvm]<br>[ITEM_NOT_OWNED](-i-t-e-m_-n-o-t_-o-w-n-e-d/index.md)<br>Requested action on the item failed since it is not owned by the user. |
| [NETWORK_ERROR](-n-e-t-w-o-r-k_-e-r-r-o-r/index.md) | [androidJvm]<br>[NETWORK_ERROR](-n-e-t-w-o-r-k_-e-r-r-o-r/index.md)<br>A network error occurred during the operation. |

## Properties

| Name | Summary |
|---|---|
| [code](code.md) | [androidJvm]<br>val [code](code.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [entries](entries.md) | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[BillingResponseCode](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [BillingResponseCode](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[BillingResponseCode](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
