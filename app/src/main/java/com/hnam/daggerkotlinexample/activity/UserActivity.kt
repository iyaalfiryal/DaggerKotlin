package com.hnam.daggerkotlinexample.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hnam.daggerkotlinexample.DaggerUserComponent
import com.hnam.daggerkotlinexample.NetworkUtils

import com.hnam.daggerkotlinexample.R
import com.hnam.daggerkotlinexample.app.App
import javax.inject.Inject


class UserActivity : AppCompatActivity() {

    @Inject lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        DaggerUserComponent.builder()
                .myComponent(App.getInstance().appComponent)
                .build().inject(this)
        Log.e("UserActivity", "networkUtils = " + networkUtils.toString())

    }
}
