//[billing](../../../../index.md)/[com.faa.billing.core.settings](../../index.md)/[BillingClientSettings](../index.md)/[Builder](index.md)

# Builder

[androidJvm]\
class [Builder](index.md)

## Constructors

| | |
|---|---|
| [Builder](-builder.md) | [androidJvm]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [build](build.md) | [androidJvm]<br>fun [build](build.md)(): [BillingClientSettings](../index.md) |
| [setContext](set-context.md) | [androidJvm]<br>fun [setContext](set-context.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)): [BillingClientSettings.Builder](index.md)<br>Mandatory field. Sets the Android application context. |
| [setPurchasesUpdatedListener](set-purchases-updated-listener.md) | [androidJvm]<br>fun [setPurchasesUpdatedListener](set-purchases-updated-listener.md)(purchasesUpdatedListener: [PurchasesUpdatedListener](../../../com.faa.billing.core.api.data.purchase/-purchases-updated-listener/index.md)): [BillingClientSettings.Builder](index.md)<br>Mandatory field. Sets the listener through which notifications for purchases updates will be propagated to. |
| [setTestMode](set-test-mode.md) | [androidJvm]<br>fun [setTestMode](set-test-mode.md)(isTestModeEnabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [BillingClientSettings.Builder](index.md)<br>Optional field. Sets the test mode flag indicating whether the billing client operates in test mode. |
