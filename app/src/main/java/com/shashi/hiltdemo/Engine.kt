package com.shashi.hiltdemo

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    private val TAG = "Engine"

    fun getEngine() {
        Log.d(TAG, "getEngine: Engine is Running")
    }

}