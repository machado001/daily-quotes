plugins {
    alias(libs.plugins.machado001.android.library)
}

android {
    namespace = "com.machado001.dailyquote.data"
}

dependencies {

    implementation(projects.dailyQuote.domain)
    implementation(libs.bundles.koin)

    implementation(libs.generativeai)
    implementation(libs.ktor.client.core)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}