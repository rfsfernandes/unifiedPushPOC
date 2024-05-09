//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[ProductDetails](../index.md)/[SubscriptionOfferDetails](index.md)

# SubscriptionOfferDetails

[androidJvm]\
@Serializable

data class [SubscriptionOfferDetails](index.md)

Represents the available purchase plans to buy a subscription product.

## Properties

| Name | Summary |
|---|---|
| [basePlanId](base-plan-id.md) | [androidJvm]<br>val [basePlanId](base-plan-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The base plan id associated with the subscription product. |
| [offerId](offer-id.md) | [androidJvm]<br>val [offerId](offer-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The offer id associated with the subscription product. |
| [offerTags](offer-tags.md) | [androidJvm]<br>val [offerTags](offer-tags.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>The offer tags associated with this Subscription Offer. |
| [offerToken](offer-token.md) | [androidJvm]<br>val [offerToken](offer-token.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The offer token required to pass in launchBillingFlow to purchase the subscription product with these pricing phases. |
| [pricingPhases](pricing-phases.md) | [androidJvm]<br>val [pricingPhases](pricing-phases.md): PricingPhases<br>The pricing phases for the subscription product. |
