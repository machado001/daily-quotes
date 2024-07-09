package com.machado001.dailyquote.presentation.quote

sealed interface DailyQuoteAction {
    data object onLikeClick : DailyQuoteAction
    data object onDeslikeClick : DailyQuoteAction
    data object onGenerateNewQuoteClick : DailyQuoteAction
}
