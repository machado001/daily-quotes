plugins {
    alias(libs.plugins.machado001.android.feature.ui)
}

android {
    namespace = "com.machado001.dailyquote.presentation"
}

dependencies {
    implementation(projects.dailyQuote.domain)
}