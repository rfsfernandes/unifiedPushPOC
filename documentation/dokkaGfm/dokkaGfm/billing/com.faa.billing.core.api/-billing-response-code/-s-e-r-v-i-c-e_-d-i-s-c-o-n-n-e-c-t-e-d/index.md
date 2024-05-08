//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[BillingResponseCode](../index.md)/[SERVICE_DISCONNECTED](index.md)

# SERVICE_DISCONNECTED

[androidJvm]\
[SERVICE_DISCONNECTED](index.md)

The app is not connected to the Billing service via the In-App SDK.

Examples where this error may occur:

- 
   The Billing Service was being updated in the background while your app was still running and the library lost connection.
- 
   BillingClient.startConnection(BillingClientStateListener) was never called or has not completed yet.

Since this state is transient, your app should automatically retry (e.g. with exponential back off) to recover from this error. Be mindful of how long you retry if the retry is happening during a user interaction. The retry should lead to a call to BillingClient.startConnection(BillingClientStateListener) right after or in some time after you received this code.
