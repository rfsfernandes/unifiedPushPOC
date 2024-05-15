import org.jetbrains.dokka.gradle.DokkaTask
import java.io.FileInputStream
import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.dokka") version "1.9.20"
}

android {
    namespace = "com.rfsfernandes.mobileunifiedpushpoc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rfsfernandes.mobileunifiedpushpoc"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<DokkaTask>().configureEach {
    moduleName.set(project.name)
    moduleVersion.set(project.version.toString())
    failOnWarning.set(false)
    suppressObviousFunctions.set(true)
    suppressInheritedMembers.set(true)
    // ..
    // source set configuration section
    // ..
}

tasks.dokkaGfm.configure {
    outputDirectory.set(file("../documentation"))
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.github.UnifiedPush:android-connector:2.4.0")
    implementation("com.jakewharton.timber:timber:5.0.1")

    val permissions_version = "4.9.2"
    implementation("com.github.permissions-dispatcher:permissionsdispatcher:$permissions_version")
    annotationProcessor("com.github.permissions-dispatcher:permissionsdispatcher-processor:$permissions_version")

    dokkaPlugin("org.jetbrains.dokka:android-documentation-plugin:1.9.20")
}