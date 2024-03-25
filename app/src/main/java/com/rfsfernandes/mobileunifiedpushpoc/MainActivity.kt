package com.rfsfernandes.mobileunifiedpushpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.unifiedpush.android.connector.UnifiedPush
import permissions.dispatcher.RuntimePermissions

@RuntimePermissions
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerAppForPush()
    }

    /**
     * Registers the app on the distributor that the user has on his device.
     */
    private fun registerAppForPush() {
        UnifiedPush.getAckDistributor(this)?.let {
            // Re-register in case something broke
            // Options:
            // "instance" to handle multiple registrations
            // "features" empty array or [FEATURE_BYTES_MESSAGE]
            //    to be sure the distributor handles non-UTF-8 input
            // "messageForDistributor" that may be displayed by the distrib.
            UnifiedPush.registerApp(this)
            return
        }
        // Get a list of distributors that are available
        val distributors = UnifiedPush.getDistributors(this)
        // select one or show a dialog or whatever
        val userDistrib = distributors.first()
        // save the distributor
        UnifiedPush.saveDistributor(this, userDistrib)
        // register your app to the distributor
        // Options:
        // "instance" to handle multiple registrations
        // "features" empty array or [FEATURE_BYTES_MESSAGE]
        //    to be sure the distributor handles non-UTF-8 input
        // "messageForDistributor" that may be displayed by the distrib.
        UnifiedPush.registerApp(this)
    }
}