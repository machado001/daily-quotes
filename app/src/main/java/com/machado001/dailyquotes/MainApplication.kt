package com.machado001.dailyquotes

import android.app.Application
import com.machado001.dailyquotes.data.di.dailyQuoteDataModule
import com.machado001.dailyquotes.presentation.di.dailyQuoteViewModelModule
import com.machado001.dailyquotes.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        configureTimber()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                dailyQuoteViewModelModule,
                appModule,
                dailyQuoteDataModule,
            )
        }
    }
}

private fun configureTimber() =
    Timber
        .plant(Timber.DebugTree())
        .takeIf { BuildConfig.DEBUG }