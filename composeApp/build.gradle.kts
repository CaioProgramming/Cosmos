import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    jvm("desktop")
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    sourceSets {
        val desktopMain by getting

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)

        }

        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
            implementation(libs.ktor.client.android)
            implementation(libs.koin.android)
        }
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            /*implementation(libs.androidx.compose.ui)
            implementation(libs.androidx.compose.animation)
            implementation(libs.androidx.compose.animation.core)*/
            implementation(libs.chrynan.colorsCore)
            implementation(libs.chrynan.colorsExtensions)
            implementation(libs.chrynan.colorsTheme)
            implementation(libs.chrynan.colorsCompose)
            implementation(libs.chrynan.colorsPalette)
            implementation(libs.alexzhirkevich.compottie)
            implementation(libs.navigation.compose)
            implementation(libs.composeResource)
            implementation(libs.kotlinDateTime)
            implementation(libs.bundles.ktor)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.kotlin.serialization)
            implementation(libs.media.kamel)
            //implementation(libs.ktor.core)
           // implementation(libs.ktor.cio)
            //implementation(libs.media.kamel.image)

            implementation(libs.koin.compose)
            implementation(libs.koin.core)
            implementation(libs.composables.ui.menu)

        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.ktor.client.cio)


        }


    }
}
compose.resources {
    publicResClass = true
    packageOfResClass = "com.ilustris.cosmos.resources"
    generateResClass = always
}

compose.desktop {
    application {
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            macOS {
                iconFile.set(project.file("icon.icns"))
            }
            windows {
                iconFile.set(project.file("icon.ico"))
            }
            linux {
                iconFile.set(project.file("ic_app.png"))
            }
        }
    }
}

android {
    namespace = "com.ilustris.cosmos"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "com.ilustris.cosmos"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
    dependencies {
        debugImplementation(compose.uiTooling)
    }
}
dependencies {
    implementation(libs.androidx.material3.android)
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.ilustris.cosmos"
            packageVersion = "1.0.0"
        }
    }
}
