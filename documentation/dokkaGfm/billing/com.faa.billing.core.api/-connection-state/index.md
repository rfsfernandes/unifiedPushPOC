//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ConnectionState](index.md)

# ConnectionState

[androidJvm]\
enum [ConnectionState](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ConnectionState](index.md)&gt; 

Connection state of billing client.

## Entries

| | |
|---|---|
| [DISCONNECTED](-d-i-s-c-o-n-n-e-c-t-e-d/index.md) | [androidJvm]<br>[DISCONNECTED](-d-i-s-c-o-n-n-e-c-t-e-d/index.md)<br>This client was not yet connected to billing service. |
| [CONNECTING](-c-o-n-n-e-c-t-i-n-g/index.md) | [androidJvm]<br>[CONNECTING](-c-o-n-n-e-c-t-i-n-g/index.md)<br>This client is currently in process of connecting to billing service. |
| [CONNECTED](-c-o-n-n-e-c-t-e-d/index.md) | [androidJvm]<br>[CONNECTED](-c-o-n-n-e-c-t-e-d/index.md)<br>This client is currently connected to billing service. |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[ConnectionState](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ConnectionState](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[ConnectionState](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
