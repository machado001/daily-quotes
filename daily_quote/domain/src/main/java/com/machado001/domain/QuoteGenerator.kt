package com.machado001.domain

fun interface QuoteGenerator {
    suspend fun generate(content: String)
}