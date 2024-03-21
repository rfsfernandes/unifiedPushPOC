package com.rfsfernandes.mobileunifiedpushpoc

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import permissions.dispatcher.NeedsPermission

/**
 * Helper object that handles notifications.
 */
object NotificationHelper {

    private val CHANNEL_ID = "my app channel"
    private lateinit var notificationChannel: NotificationChannel

    /**
     * This method creates a notification and a notification channel (if it isn't created yet) and
     * notifies the [NotificationManagerCompat] with this new notification.
     * @param context The context that is requesting to send a notification.
     * @param content The content of the notification.
     */
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    @NeedsPermission(Manifest.permission.POST_NOTIFICATIONS)
    fun sendNotification(context: Context, content: String) {
        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_android_black_24dp)
            .setContentTitle("Um teste")
            .setContentText(content)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !::notificationChannel.isInitialized) {
            val name = "Test channel"
            val descriptionText = "Test channel"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            notificationChannel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system.
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
        }
        with(NotificationManagerCompat.from(context)) {
            if (ActivityCompat.checkSelfPermission(
                    context,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                // ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                // public fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>,
                //                                        grantResults: IntArray)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.

                return@with
            }
            // notificationId is a unique int for each notification that you must define.
            notify(System.currentTimeMillis().toInt(), builder.build())
        }
    }
}
