//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ProductType](index.md)

# ProductType

\
enum [ProductType](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductType](index.md)&gt; 

Supported Product types.

## Entries

| | |
|---|---|
| [INAPP](-i-n-a-p-p/index.md) | [INAPP](-i-n-a-p-p/index.md)<br>A Product type for Android apps in-app products managed by the payments service. |
| [SUBS](-s-u-b-s/index.md) | [SUBS](-s-u-b-s/index.md)<br>A Product type for Android apps subscriptions. |
| [INAPP_UNMANAGED](-i-n-a-p-p_-u-n-m-a-n-a-g-e-d/index.md) | [INAPP_UNMANAGED](-i-n-a-p-p_-u-n-m-a-n-a-g-e-d/index.md)<br>A Product type for Android apps in-app products that are not managed by the payment service. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[ProductType](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [value](value.md) | val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the value of the supported type. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ProductType](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[ProductType](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
