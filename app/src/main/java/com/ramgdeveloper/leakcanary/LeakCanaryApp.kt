package com.ramgdeveloper.leakcanary

import android.app.Application
import leakcanary.AppWatcher

class LeakCanaryApp : Application(){
    override fun onCreate() {
        super.onCreate()
        AppWatcher.config = AppWatcher.config.copy(watchActivities = false)
    }
}