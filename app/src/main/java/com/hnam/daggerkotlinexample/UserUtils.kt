package com.hnam.daggerkotlinexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by nampham on 11/2/18.
 */
@Userscope
class UserUtils @Inject constructor() {

    fun doSomething(){
        Log.e("UserUtils", " UserUtils do something");
    }
}