package com.hnam.daggerkotlinexample

import com.hnam.daggerkotlinexample.activity.MainActivity
import com.hnam.daggerkotlinexample.activity.UserActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by nampham on 10/1/18.
 */
@Singleton
@Component(modules= [MyModule::class])
interface MyComponent {
    fun plus(module: UserModule) : UserComponent
}