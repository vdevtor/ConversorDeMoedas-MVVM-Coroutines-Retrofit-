package com.example.currentapp

import android.app.Application
import com.example.currentapp.di.AppComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(AppComponent.getAllModules())
        }
    }
}