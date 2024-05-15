//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ProductDetails](index.md)

# ProductDetails

[androidJvm]\
@Serializable

data class [ProductDetails](index.md)

Represents the details of a one time or subscription product.

## Types

| Name | Summary |
|---|---|
| [OneTimePurchaseOfferDetails](-one-time-purchase-offer-details/index.md) | [androidJvm]<br>@Serializable<br>data class [OneTimePurchaseOfferDetails](-one-time-purchase-offer-details/index.md)<br>Represents the offer details to buy an one-time purchase product. |
| [PricingPhase](-pricing-phase/index.md) | [androidJvm]<br>@Serializable<br>data class [PricingPhase](-pricing-phase/index.md)<br>Represents a pricing phase, describing how a user pays at a point in time. |
| [RecurrenceMode](-recurrence-mode/index.md) | [androidJvm]<br>@Serializable<br>enum [RecurrenceMode](-recurrence-mode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductDetails.RecurrenceMode](-recurrence-mode/index.md)&gt; <br>Recurrence mode of the pricing phase. |
| [SubscriptionOfferDetails](-subscription-offer-details/index.md) | [androidJvm]<br>@Serializable<br>data class [SubscriptionOfferDetails](-subscription-offer-details/index.md)<br>Represents the available purchase plans to buy a subscription product. |

## Properties

| Name | Summary |
|---|---|
| [description](description.md) | [androidJvm]<br>val [description](description.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The description of the product. |
| [name](name.md) | [androidJvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The name of the product being sold. |
| [oneTimePurchaseOfferDetails](one-time-purchase-offer-details.md) | [androidJvm]<br>val [oneTimePurchaseOfferDetails](one-time-purchase-offer-details.md): [ProductDetails.OneTimePurchaseOfferDetails](-one-time-purchase-offer-details/index.md)<br>The offer details of an one-time purchase product. |
| [productId](product-id.md) | [androidJvm]<br>val [productId](product-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The product's Id. |
| [productType](product-type.md) | [androidJvm]<br>val [productType](product-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the [BillingClient.ProductType](../-product-type/index.md) of the product. |
| [subscriptionOfferDetails](subscription-offer-details.md) | [androidJvm]<br>val [subscriptionOfferDetails](subscription-offer-details.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProductDetails.SubscriptionOfferDetails](-subscription-offer-details/index.md)&gt;? = null<br>Returns a list containing all available offers to purchase a subscription product. |
| [title](title.md) | [androidJvm]<br>val [title](title.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the product being sold. |
