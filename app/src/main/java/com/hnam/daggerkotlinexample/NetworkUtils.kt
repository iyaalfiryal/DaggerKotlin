package com.hnam.daggerkotlinexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by nampham on 11/2/18.
 */
@Singleton
class NetworkUtils @Inject constructor(){

    fun doSomething(){
        Log.e("NetworkUtils", "Network -> doSomething()")
    }
}