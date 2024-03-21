//[app](../../../index.md)/[com.rfsfernandes.mobileunifiedpushpoc](../index.md)/[PushReceiver](index.md)

# PushReceiver

[androidJvm]\
class [PushReceiver](index.md) : MessagingReceiver

A class that handles the push notifications sent from the registered distributor.

## Constructors

| | |
|---|---|
| [PushReceiver](-push-receiver.md) | [androidJvm]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [onMessage](on-message.md) | [androidJvm]<br>@[RequiresApi](https://developer.android.com/reference/kotlin/androidx/annotation/RequiresApi.html)(value = 33)<br>open override fun [onMessage](on-message.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), message: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>When a message is received it is handled here. |
| [onNewEndpoint](on-new-endpoint.md) | [androidJvm]<br>open override fun [onNewEndpoint](on-new-endpoint.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), endpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Called when a new endpoint is to be used for sending push messages You should send the endpoint to your application server and sync for missing notifications. |
| [onRegistrationFailed](on-registration-failed.md) | [androidJvm]<br>open override fun [onRegistrationFailed](on-registration-failed.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Called when the registration is not possible, eg. no network |
| [onUnregistered](on-unregistered.md) | [androidJvm]<br>open override fun [onUnregistered](on-unregistered.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Called when this application is unregistered from receiving push messages |
