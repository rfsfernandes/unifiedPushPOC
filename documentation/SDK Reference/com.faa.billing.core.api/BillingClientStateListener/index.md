//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingClientStateListener](index.md)

# BillingClientStateListener

\
interface [BillingClientStateListener](index.md)

Callback for setup process. This listener's [onBillingSetupFinished(BillingResult)](on-billing-setup-finished.md) method is called when the setup process is complete.

## Functions

| Name | Summary |
|---|---|
| [onBillingServiceDisconnected](on-billing-service-disconnected.md) | abstract fun [onBillingServiceDisconnected](on-billing-service-disconnected.md)()<br>Called to notify that the connection to the billing service was lost. |
| [onBillingSetupFinished](on-billing-setup-finished.md) | abstract fun [onBillingSetupFinished](on-billing-setup-finished.md)(billingResponseCode: [BillingResponseCode](../BillingResponseCode/index.md))<br>Called to notify that setup is complete. |
