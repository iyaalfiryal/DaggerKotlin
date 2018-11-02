package com.hnam.daggerkotlinexample.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.hnam.daggerkotlinexample.*
import com.hnam.daggerkotlinexample.app.App
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

//    @Inject @field:Named(LOVE) lateinit var infoLove: Info
//    @Inject @field:Named(HAPPY) lateinit var infoHappy: Info

    @Inject lateinit var networkUtils: NetworkUtils


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerUserComponent.builder()
                .myComponent(App.getInstance().appComponent)
                .build().inject(this)
//        Log.e(TAG, "love ${infoLove.name}")
//        Log.e(TAG, "happy ${infoHappy.name} ")
        Log.e(TAG, "networkUtils = " + networkUtils.toString())

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var i = Intent(this@MainActivity, UserActivity::class.java)
            startActivity(i)

        }
    }

    companion object {
        const val LOVE = "love"
        const val HAPPY = "happy"
    }
}
