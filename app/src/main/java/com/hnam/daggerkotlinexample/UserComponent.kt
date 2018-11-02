package com.hnam.daggerkotlinexample

import com.hnam.daggerkotlinexample.activity.MainActivity
import com.hnam.daggerkotlinexample.activity.UserActivity
import dagger.Component

/**
 * Created by nampham on 11/2/18.
 */

@Userscope
@Component(modules = [UserModule::class], dependencies = [MyComponent::class])
interface UserComponent {
    fun inject(activity: UserActivity)
    fun inject(activity: MainActivity)
}