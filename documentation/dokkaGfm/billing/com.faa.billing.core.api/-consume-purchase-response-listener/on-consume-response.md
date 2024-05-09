//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[ConsumePurchaseResponseListener](index.md)/[onConsumeResponse](on-consume-response.md)

# onConsumeResponse

[androidJvm]\
abstract fun [onConsumeResponse](on-consume-response.md)(billingResponseCode: [BillingResponseCode](../-billing-response-code/index.md), purchaseToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Called to notify that a consume operation has finished.

#### Parameters

androidJvm

| | |
|---|---|
| billingResponseCode | [BillingResponseCode](../-billing-response-code/index.md) Result of the consume operation. [ITEM_NOT_OWNED](../-billing-response-code/-i-t-e-m_-n-o-t_-o-w-n-e-d/index.md) if the user does not currently own the item. |
| purchaseToken | The purchase token that was (or is to be) consumed. |
