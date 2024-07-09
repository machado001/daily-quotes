plugins {
    alias(libs.plugins.machado001.android.library)
}

android {
    namespace = "com.machado001.dailyquote.core.data"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}