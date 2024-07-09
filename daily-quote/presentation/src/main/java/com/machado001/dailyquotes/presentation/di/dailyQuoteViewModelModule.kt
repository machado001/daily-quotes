package com.machado001.dailyquotes.presentation.di

import com.machado001.dailyquotes.presentation.quote.DailyQuoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val dailyQuoteViewModelModule = module {
    viewModelOf(::DailyQuoteViewModel)
}