package com.machado001.dailyquotes.presentation.quote

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.machado001.domain.QuoteGenerator
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class DailyQuoteViewModel(
    private val quoteGenerator: QuoteGenerator
) : ViewModel() {
    var state by mutableStateOf(DailyQuoteState())
        private set

    private val eventChannel = Channel<DailyQuoteAction>()
    val events = eventChannel.receiveAsFlow()


    fun onAction(action: DailyQuoteAction) {
        when (action) {
            DailyQuoteAction.onDeslikeClick -> handleDeslike()
            DailyQuoteAction.onGenerateNewQuoteClick ->
                viewModelScope.launch {
//                    generateNewQuote()
                }
            DailyQuoteAction.onLikeClick -> handleLike()
        }
    }

    private suspend fun generateNewQuote(content: String) {
        quoteGenerator.generate(content)
    }

    private fun handleLike() {
//        TODO("Not yet implemented")
    }

    private fun handleDeslike() {
//        TODO("Not yet implemented")
    }
}