//[app](../../../index.md)/[com.rfsfernandes.mobileunifiedpushpoc](../index.md)/[PushReceiver](index.md)/[onMessage](on-message.md)

# onMessage

[androidJvm]\

@[RequiresApi](https://developer.android.com/reference/kotlin/androidx/annotation/RequiresApi.html)(value = 33)

open override fun [onMessage](on-message.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), message: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), instance: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

When a message is received it is handled here.

#### Parameters

androidJvm

| | |
|---|---|
| context | Context of the message received. |
| message | The message sent in the body of the push notification. |
| instance | The instance of the push. |
