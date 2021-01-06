package com.shashi.hiltdemo

import android.util.Log
import javax.inject.Inject

//Constructor  Injection

class Car
@Inject
constructor(private val engine: Engine, private val wheel: Wheel) {

    private val TAG = "Car"

    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d(TAG, "getCar: Car is running")
    }

}

//Field Injection

//class Car @Inject constructor() {
//    fun getCar() {
//        Log.d("car", "Car is running")
//    }
//}