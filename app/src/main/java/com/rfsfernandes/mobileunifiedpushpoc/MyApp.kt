package com.rfsfernandes.mobileunifiedpushpoc

import android.app.Application
import org.unifiedpush.android.connector.UnifiedPush.registerAppWithDialog
import org.unifiedpush.android.connector.UnifiedPush.unregisterApp
import timber.log.Timber

/**
 * Application class.
 */
class MyApp: Application() {
    override fun onCreate() {
        Timber.plant(Timber.DebugTree())
        super.onCreate()
    }
}