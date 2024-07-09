package com.machado001.dailyquotes.data.di

import com.machado001.domain.QuoteGenerator
import com.machado001.dailyquotes.data.GenerativeAi
import org.koin.dsl.module

val dailyQuoteDataModule = module {

    single<QuoteGenerator> { GenerativeAi}
}