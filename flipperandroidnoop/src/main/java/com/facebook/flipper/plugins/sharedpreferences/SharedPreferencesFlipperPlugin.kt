package com.facebook.flipper.plugins.sharedpreferences

import android.content.Context
import com.facebook.flipper.core.FlipperPlugin

class SharedPreferencesFlipperPlugin : FlipperPlugin {

    override fun onConnect(connection: Any?) {
        // no op
    }

    override fun onDisconnect() {
        // no op
    }

    override fun runInBackground(): Boolean = false

    constructor(context: Context)

    @JvmOverloads
    constructor(context: Context, name: String, mode: Int = Context.MODE_PRIVATE)

    constructor(context: Context, descriptors: List<SharedPreferencesDescriptor>)

    class SharedPreferencesDescriptor(name: String, mode: Int)

    companion object {

        @JvmStatic
        val ID: String = ""
    }
}