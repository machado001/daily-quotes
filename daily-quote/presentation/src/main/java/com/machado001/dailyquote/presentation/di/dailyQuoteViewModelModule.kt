package com.machado001.dailyquote.presentation.di

import com.machado001.dailyquote.presentation.quote.DailyQuoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val dailyQuoteViewModelModule = module {
    viewModelOf(::DailyQuoteViewModel)
}