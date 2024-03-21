package com.rfsfernandes.mobileunifiedpushpoc

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import org.unifiedpush.android.connector.MessagingReceiver
import timber.log.Timber

/**
 * A class that handles the push notifications sent from the registered distributor.
 */
class PushReceiver: MessagingReceiver() {
    /**
     * When a message is received it is handled here.
     * @param context Context of the message received.
     * @param message The message sent in the body of the push notification.
     * @param instance The instance of the push.
     */
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onMessage(context: Context, message: ByteArray, instance: String) {
        // Called when a new message is received. The message contains the full POST body of the push message
        NotificationHelper.sendNotification(context, message.toString(Charsets.UTF_8))
        Timber.d("Notification sent with payload: ${message.toString(Charsets.UTF_8)}")
    }

    /**
     * Called when a new endpoint is to be used for sending push messages
     * You should send the endpoint to your application server
     * and sync for missing notifications.
     * @param context Context of the message received.
     * @param endpoint New endpoint received.
     * @param instance The instance of the push.
     */
    override fun onNewEndpoint(context: Context, endpoint: String, instance: String) {
        // Called when a new endpoint is to be used for sending push messages
        // You should send the endpoint to your application server
        // and sync for missing notifications.
        Timber.d("Endpoint for push: $endpoint")
    }

    /**
     * Called when the registration is not possible, eg. no network
     * @param context Context of the message received.
     * @param instance The instance of the push.
     */
    override fun onRegistrationFailed(context: Context, instance: String) {
        // called when the registration is not possible, eg. no network
        Timber.d("Endpoint for push: $instance")
    }

    /**
     * Called when this application is unregistered from receiving push messages
     * @param context Context of the message received.
     * @param instance The instance of the push.
     */
    override fun onUnregistered(context: Context, instance: String){
        // called when this application is unregistered from receiving push messages
        Timber.d("Endpoint for push: $instance")
    }
}