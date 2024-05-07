//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingClientStateListener](index.md)

# BillingClientStateListener

[androidJvm]\
interface [BillingClientStateListener](index.md)

Callback for setup process. This listener's [onBillingSetupFinished(BillingResult)](on-billing-setup-finished.md) method is called when the setup process is complete.

## Functions

| Name | Summary |
|---|---|
| [onBillingServiceDisconnected](on-billing-service-disconnected.md) | [androidJvm]<br>abstract fun [onBillingServiceDisconnected](on-billing-service-disconnected.md)()<br>Called to notify that the connection to the billing service was lost. |
| [onBillingSetupFinished](on-billing-setup-finished.md) | [androidJvm]<br>abstract fun [onBillingSetupFinished](on-billing-setup-finished.md)(billingResponseCode: [BillingResponseCode](../-billing-response-code/index.md))<br>Called to notify that setup is complete. |
