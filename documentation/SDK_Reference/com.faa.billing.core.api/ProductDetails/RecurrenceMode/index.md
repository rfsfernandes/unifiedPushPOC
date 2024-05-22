//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[ProductDetails](../index.md)/[RecurrenceMode](index.md)

# RecurrenceMode

\
@Serializable

enum [RecurrenceMode](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductDetails.RecurrenceMode](index.md)&gt; 

Recurrence mode of the pricing phase.

## Entries

| | |
|---|---|
| [FINITE_RECURRING](FINITE_RECURRING/index.md) | [FINITE_RECURRING](FINITE_RECURRING/index.md)<br>The billing plan payment recurs for a fixed number of billing period set in billingCycleCount. |
| [INFINITE_RECURRING](-i-nFINITE_RECURRING/index.md) | [INFINITE_RECURRING](-i-nFINITE_RECURRING/index.md)<br>The billing plan payment recurs for infinite billing periods unless cancelled. |
| [NON_RECURRING](NON_RECURRING/index.md) | [NON_RECURRING](NON_RECURRING/index.md)<br>The billing plan payment is a one time charge that does not repeat. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[ProductDetails.RecurrenceMode](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ProductDetails.RecurrenceMode](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[ProductDetails.RecurrenceMode](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
