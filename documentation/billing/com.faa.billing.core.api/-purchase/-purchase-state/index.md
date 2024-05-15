//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[Purchase](../index.md)/[PurchaseState](index.md)

# PurchaseState

[androidJvm]\
@Serializable(with = PurchaseStateSerializer::class)

enum [PurchaseState](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Purchase.PurchaseState](index.md)&gt; 

Possible purchase states.

## Entries

| | |
|---|---|
| [UNSPECIFIED_STATE](-u-n-s-p-e-c-i-f-i-e-d_-s-t-a-t-e/index.md) | [androidJvm]<br>[UNSPECIFIED_STATE](-u-n-s-p-e-c-i-f-i-e-d_-s-t-a-t-e/index.md)<br>Represents an unspecified state of a purchase. |
| [PURCHASED](-p-u-r-c-h-a-s-e-d/index.md) | [androidJvm]<br>[PURCHASED](-p-u-r-c-h-a-s-e-d/index.md)<br>Represents a purchased state. Indicates that the purchase has been completed. |
| [PENDING](-p-e-n-d-i-n-g/index.md) | [androidJvm]<br>[PENDING](-p-e-n-d-i-n-g/index.md)<br>Represents a pending state. Indicates that the purchase is pending completion. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[Purchase.PurchaseState](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Purchase.PurchaseState](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Purchase.PurchaseState](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
