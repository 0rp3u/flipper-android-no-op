package com.facebook.flipper.plugins.databases

import android.content.Context
import com.facebook.flipper.core.FlipperPlugin

class DatabasesFlipperPlugin(context: Context) : FlipperPlugin {

    override fun onConnect(connection: Any?) {
        // no op
    }

    override fun onDisconnect() {
        // no op
    }

    override fun runInBackground(): Boolean = false

    companion object {
        @JvmStatic
        val ID: String = ""
    }
}