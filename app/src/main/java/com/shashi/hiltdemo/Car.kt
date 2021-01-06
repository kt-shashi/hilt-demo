package com.shashi.hiltdemo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {
    private val TAG = "Car"
    fun getCar() {
        Log.d(TAG, "getCar: Car is Running")
    }
}