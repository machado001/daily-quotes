import com.android.build.api.dsl.LibraryExtension
import com.machado001.convention.ExtensionType
import com.machado001.convention.configureBuildTypes
import com.machado001.convention.configureKotlinAndroid
import com.machado001.convention.configureKotlinJvm
import com.machado001.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")
            configureKotlinJvm()
        }
    }
}