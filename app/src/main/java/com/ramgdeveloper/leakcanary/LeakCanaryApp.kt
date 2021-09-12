package com.ramgdeveloper.leakcanary

import android.app.Application
import leakcanary.AppWatcher

class LeakCanaryApp: Application() {
    override fun onCreate() {
        super.onCreate()
        val objectWatcher = AppWatcher.objectWatcher
    }
}