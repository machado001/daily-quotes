package com.machado001.daily_quote.data.di

import com.machado001.domain.QuoteGenerator
import com.machado001.daily_quote.data.GenerativeAi
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dailyQuoteDataModule = module {

    single<QuoteGenerator> { GenerativeAi}
}