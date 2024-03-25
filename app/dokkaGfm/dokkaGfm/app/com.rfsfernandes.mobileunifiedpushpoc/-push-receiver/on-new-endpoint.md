//[app](../../../index.md)/[com.rfsfernandes.mobileunifiedpushpoc](../index.md)/[PushReceiver](index.md)/[onNewEndpoint](on-new-endpoint.md)

# onNewEndpoint

[androidJvm]\
open override fun [onNewEndpoint](on-new-endpoint.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), endpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Called when a new endpoint is to be used for sending push messages You should send the endpoint to your application server and sync for missing notifications.

#### Parameters

androidJvm

| | |
|---|---|
| context | Context of the message received. |
| endpoint | New endpoint received. |
| instance | The instance of the push. |
