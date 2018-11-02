package com.hnam.daggerkotlinexample.app

import android.app.Application
import com.hnam.daggerkotlinexample.DaggerMyComponent
import com.hnam.daggerkotlinexample.MyComponent

/**
 * Created by nampham on 11/2/18.
 */
class App : Application() {

    lateinit var appComponent: MyComponent

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerMyComponent.create()
    }

    fun getApplicationComponent() : MyComponent{
        return appComponent
    }

    companion object {
        private lateinit var instance: App

        fun getInstance() : App{
            return instance
        }
    }
}