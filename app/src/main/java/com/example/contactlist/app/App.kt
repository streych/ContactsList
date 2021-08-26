package com.example.contactlist.app

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
}

interface IContextProvider{
    val context: Context
}

object ContextProvider: IContextProvider{
    override val context: Context
        get() = App.context

}