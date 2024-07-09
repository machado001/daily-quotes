package com.machado001.dailyquotes.data

import com.google.ai.client.generativeai.GenerativeModel
import com.machado001.domain.QuoteGenerator

object GenerativeAi : QuoteGenerator {

    private val model: GenerativeModel by lazy {
        GenerativeModel(
            modelName = "gemini-pro",
            apiKey = BuildConfig.API_KEY
        )
    }

    override suspend fun generate(content: String) {
        model.generateContent(content)
    }
}