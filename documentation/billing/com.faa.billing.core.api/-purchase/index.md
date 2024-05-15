//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[Purchase](index.md)

# Purchase

[androidJvm]\
@Serializable

data class [Purchase](index.md)

This class represents a purchase with various attributes.

## Types

| Name | Summary |
|---|---|
| [PurchaseState](-purchase-state/index.md) | [androidJvm]<br>@Serializable(with = PurchaseStateSerializer::class)<br>enum [PurchaseState](-purchase-state/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Purchase.PurchaseState](-purchase-state/index.md)&gt; <br>Possible purchase states. |

## Properties

| Name | Summary |
|---|---|
| [accountIdentifiers](account-identifiers.md) | [androidJvm]<br>val [accountIdentifiers](account-identifiers.md): [AccountIdentifiers](../-account-identifiers/index.md)? = null<br>Account identifiers that were provided when the purchase was made. |
| [developerPayload](developer-payload.md) | [androidJvm]<br>val [developerPayload](developer-payload.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>Returns the payload specified when the purchase was acknowledged or consumed. |
| [isAcknowledged](is-acknowledged.md) | [androidJvm]<br>val [isAcknowledged](is-acknowledged.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the purchase has been acknowledged. |
| [isAutoRenewing](is-auto-renewing.md) | [androidJvm]<br>val [isAutoRenewing](is-auto-renewing.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the subscription renews automatically. |
| [orderId](order-id.md) | [androidJvm]<br>val [orderId](order-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A unique order identifier for the transaction. |
| [originalJson](original-json.md) | [androidJvm]<br>val [originalJson](original-json.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A String in JSON format that contains details about the purchase order. |
| [packageName](package-name.md) | [androidJvm]<br>val [packageName](package-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The application package from which the purchase originated. |
| [products](products.md) | [androidJvm]<br>val [products](products.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>The product Ids. |
| [purchaseState](purchase-state.md) | [androidJvm]<br>val [purchaseState](purchase-state.md): [Purchase.PurchaseState](-purchase-state/index.md)<br>One of [PurchaseState](-purchase-state/index.md) indicating the state of the purchase. |
| [purchaseTime](purchase-time.md) | [androidJvm]<br>val [purchaseTime](purchase-time.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). |
| [purchaseToken](purchase-token.md) | [androidJvm]<br>val [purchaseToken](purchase-token.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A token that uniquely identifies a purchase for a given item and user pair. |
| [quantity](quantity.md) | [androidJvm]<br>val [quantity](quantity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of the purchase. |
| [signature](signature.md) | [androidJvm]<br>val [signature](signature.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>String containing the signature of the purchase data that was signed with the private key of the developer. |
