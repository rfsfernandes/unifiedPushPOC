//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ProductType](index.md)

# ProductType

\
enum [ProductType](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductType](index.md)&gt; 

Supported Product types.

## Entries

| | |
|---|---|
| [INAPP](INAPP/index.md) | [INAPP](INAPP/index.md)<br>A Product type for Android apps in-app products managed by the payments service. |
| [SUBS](SUBS/index.md) | [SUBS](SUBS/index.md)<br>A Product type for Android apps subscriptions. |
| [INAPP_UNMANAGED](INAPP_UNMANAGED/index.md) | [INAPP_UNMANAGED](INAPP_UNMANAGED/index.md)<br>A Product type for Android apps in-app products that are not managed by the payment service. |

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
