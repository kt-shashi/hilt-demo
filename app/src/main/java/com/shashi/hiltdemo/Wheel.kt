package com.shashi.hiltdemo

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {

    private val TAG = "Wheel"

    fun getWheel() {
        Log.d(TAG, "getWheel: Wheel is running")
    }

}