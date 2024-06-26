//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ProductDetails](index.md)

# ProductDetails

\
@Serializable

data class [ProductDetails](index.md)

Represents the details of a one time or subscription product.

## Types

| Name | Summary |
|---|---|
| [OneTimePurchaseOfferDetails](-one-timePurchase-offer-details/index.md) | @Serializable<br>data class [OneTimePurchaseOfferDetails](-one-timePurchase-offer-details/index.md)<br>Represents the offer details to buy an one-time purchase product. |
| [PricingPhase](PricingPhase/index.md) | @Serializable<br>data class [PricingPhase](PricingPhase/index.md)<br>Represents a pricing phase, describing how a user pays at a point in time. |
| [RecurrenceMode](RecurrenceMode/index.md) | @Serializable<br>enum [RecurrenceMode](RecurrenceMode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ProductDetails.RecurrenceMode](RecurrenceMode/index.md)&gt; <br>Recurrence mode of the pricing phase. |
| [SubscriptionOfferDetails](SubscriptionOfferDetails/index.md) | @Serializable<br>data class [SubscriptionOfferDetails](SubscriptionOfferDetails/index.md)<br>Represents the available purchase plans to buy a subscription product. |

## Properties

| Name | Summary |
|---|---|
| [description](description.md) | val [description](description.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The description of the product. |
| [name](name.md) | val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The name of the product being sold. |
| [oneTimePurchaseOfferDetails](one-timePurchase-offer-details.md) | val [oneTimePurchaseOfferDetails](one-timePurchase-offer-details.md): [ProductDetails.OneTimePurchaseOfferDetails](-one-timePurchase-offer-details/index.md)<br>The offer details of an one-time purchase product. |
| [productId](product-id.md) | val [productId](product-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The product's Id. |
| [productType](product-type.md) | val [productType](product-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the [BillingClient.ProductType](../ProductType/index.md) of the product. |
| [subscriptionOfferDetails](subscription-offer-details.md) | val [subscriptionOfferDetails](subscription-offer-details.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ProductDetails.SubscriptionOfferDetails](SubscriptionOfferDetails/index.md)&gt;? = null<br>Returns a list containing all available offers to purchase a subscription product. |
| [title](title.md) | val [title](title.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the product being sold. |
