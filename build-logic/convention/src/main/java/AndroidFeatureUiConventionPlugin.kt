import com.android.build.api.dsl.LibraryExtension
import com.machado001.convention.ExtensionType
import com.machado001.convention.addUiLayerDependencies
import com.machado001.convention.configureAndroidCompose
import com.machado001.convention.configureBuildTypes
import com.machado001.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidFeatureUiConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {


            pluginManager.run {
                apply("machado001.android.library.compose")
            }
            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}