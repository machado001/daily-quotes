package com.machado001.dailyquote.presentation.quote

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.machado001.dailyquote.presentation.theme.GeminiDayQuotesTheme
import org.koin.androidx.compose.koinViewModel


@Composable

fun DailyQuoteScreenRoot(
    viewModel: DailyQuoteViewModel = koinViewModel()
) {
    DailyQuoteScreen(
        state = viewModel.state,
        onAction = viewModel::onAction
    )
}

@Composable
private fun DailyQuoteScreen(
    state: DailyQuoteState,
    onAction: (DailyQuoteAction) -> Unit
) {
    Text(text = "Hello Clean!")
}

@Preview
@Composable

private fun DailyQuoteScreenPreview() {
    GeminiDayQuotesTheme {
        DailyQuoteScreen(
            state = DailyQuoteState(),
            onAction = {}
        )
    }
}
