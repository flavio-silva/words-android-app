package br.com.flaviosilvadev.roomwordsample

import android.app.Application
import br.com.flaviosilvadev.roomwordsample.di.dbModule
import br.com.flaviosilvadev.roomwordsample.di.repositoryModule
import br.com.flaviosilvadev.roomwordsample.di.uiModule
import br.com.flaviosilvadev.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}