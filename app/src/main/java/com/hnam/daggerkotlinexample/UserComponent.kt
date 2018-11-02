package com.hnam.daggerkotlinexample

import com.hnam.daggerkotlinexample.UserModule
import com.hnam.daggerkotlinexample.activity.MainActivity
import com.hnam.daggerkotlinexample.activity.UserActivity
import dagger.Subcomponent

/**
 * Created by nampham on 11/2/18.
 */
@Subcomponent(modules = [UserModule::class])
@Userscope
interface UserComponent{
    fun inject(activity: MainActivity)
    fun inject(activity: UserActivity)
}
