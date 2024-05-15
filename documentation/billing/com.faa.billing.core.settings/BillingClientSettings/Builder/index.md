//[billing](../../../../index.md)/[com.faa.billing.core.settings](../../index.md)/[BillingClientSettings](../index.md)/[Builder](index.md)

# Builder

\
class [Builder](index.md)

## Constructors

| | |
|---|---|
| [Builder](-builder.md) | constructor() |

## Functions

| Name | Summary |
|---|---|
| [build](build.md) | fun [build](build.md)(): [BillingClientSettings](../index.md) |
| [setContext](set-context.md) | fun [setContext](set-context.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)): [BillingClientSettings.Builder](index.md)<br>Mandatory field. Sets the Android application context. |
| [setPurchasesUpdatedListener](set-purchases-updated-listener.md) | fun [setPurchasesUpdatedListener](set-purchases-updated-listener.md)(purchasesUpdatedListener: [PurchasesUpdatedListener](../../../com.faa.billing.core.api.data.purchase/-purchases-updated-listener/index.md)): [BillingClientSettings.Builder](index.md)<br>Mandatory field. Sets the listener through which notifications for purchases updates will be propagated to. |
| [setTestMode](set-test-mode.md) | fun [setTestMode](set-test-mode.md)(isTestModeEnabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [BillingClientSettings.Builder](index.md)<br>Optional field. Sets the test mode flag indicating whether the billing client operates in test mode. |
