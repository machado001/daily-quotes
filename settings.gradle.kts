pluginManagement {
    repositories {
        includeBuild("build-logic")
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}



enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "GeminiDayQuotes"
include(":app")
include(":daily-quote:data")
include(":daily-quote:domain")
include(":core:domain")
include(":core:data")
include(":core:presentation")
include(":core:presentation:ui")
include(":core:presentation:designsystem")
include(":daily-quote:presentation")
