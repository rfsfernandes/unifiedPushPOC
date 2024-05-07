//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[BillingResponseCode](../index.md)/[SERVICE_UNAVAILABLE](index.md)

# SERVICE_UNAVAILABLE

[androidJvm]\
[SERVICE_UNAVAILABLE](index.md)

The service is currently unavailable.

Since this state is transient, your app should automatically retry (e.g. with exponential back off) to recover from this error. Be mindful of how long you retry if the retry is happening during a user interaction.
