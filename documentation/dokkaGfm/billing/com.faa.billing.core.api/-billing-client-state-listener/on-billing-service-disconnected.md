//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingClientStateListener](index.md)/[onBillingServiceDisconnected](on-billing-service-disconnected.md)

# onBillingServiceDisconnected

[androidJvm]\
abstract fun [onBillingServiceDisconnected](on-billing-service-disconnected.md)()

Called to notify that the connection to the billing service was lost.

Note: This does not remove the billing service connection itself - this binding to the service will remain active, and you will receive a call to onBillingSetupFinished(BillingResult) when the billing service is next running and setup is complete.
