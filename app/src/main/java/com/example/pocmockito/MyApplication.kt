package com.example.pocmockito

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.core.Koin.Companion.logger

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        logger
        startKoin(this, listOf(DependecyModules.appModule))
    }
}