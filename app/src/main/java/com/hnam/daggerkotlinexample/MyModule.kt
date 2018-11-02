package com.hnam.daggerkotlinexample

import com.hnam.daggerkotlinexample.activity.MainActivity
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by nampham on 10/1/18.
 */
@Module
class MyModule {

    @Provides
    @Named(MainActivity.LOVE)
    fun provideInfoLove() : Info{
        return Info("My Love is VBN")
    }

    @Provides
    @Named(MainActivity.HAPPY)
    fun provideInfoHappy(): Info{
        return Info("My Happy is VBN")
    }

//    @Provides
//    @Singleton
//    fun provideNetworkUtils(): NetworkUtils{
//        return NetworkUtils()
//    }


}