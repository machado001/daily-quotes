plugins {
    alias(libs.plugins.machado001.android.library.compose)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.machado001.core.presentation.ui"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}