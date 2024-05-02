//[app](../../../index.md)/[com.rfsfernandes.mobileunifiedpushpoc](../index.md)/[NotificationHelper](index.md)/[sendNotification](send-notification.md)

# sendNotification

[androidJvm]\

@[RequiresApi](https://developer.android.com/reference/kotlin/androidx/annotation/RequiresApi.html)(value = 33)

fun [sendNotification](send-notification.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

This method creates a notification and a notification channel (if it isn't created yet) and notifies the [NotificationManagerCompat](https://developer.android.com/reference/kotlin/androidx/core/app/NotificationManagerCompat.html) with this new notification.

#### Parameters

androidJvm

| | |
|---|---|
| context | The context that is requesting to send a notification. |
| content | The content of the notification. |
