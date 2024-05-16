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

tasks.withType<DokkaTask>().configureEach {
    moduleName.set(project.name)
    moduleVersion.set(project.version.toString())
    outputDirectory.set(file("../documentation"))
    failOnWarning.set(false)
    suppressObviousFunctions.set(true)
    suppressInheritedMembers.set(true)
    doFirst {
        prepareDocumentationDirectory()
    }
    finalizedBy(cleanDocumentation)
}

fun prepareDocumentationDirectory() {
    val documentationDir = file("../documentation")
    if (documentationDir.exists()) {
        documentationDir.deleteRecursively()
    }
    documentationDir.mkdirs()
}

val cleanDocumentation by tasks.registering(Delete::class) {
    doLast {
        val rootDir = file("../documentation/billing") // or specify your root directory
        deleteNonIndexFiles(rootDir)
        copyReadMeToDocumentation()
    }
}

fun copyReadMeToDocumentation() {
    val sourceFile = file("../README.md")
    val destinationDir = file("../documentation")
    val destinationFile = File(destinationDir, "integration_guide.md")
    destinationFile.createNewFile()
    destinationFile.writeText(sourceFile.readText())
}

fun deleteNonIndexFiles(dir: File) {
    dir.listFiles()?.forEach { file ->
        try {
            if (file.isDirectory && file.name.startsWith("-") && file.name[2] == '-') {
                file.deleteRecursively()
                println("Deleted directory: ${file.absolutePath}")
            } else if (file.isDirectory && file.name.startsWith('-')) {
                val fileName = file.name.substring(1)
                val nameArray = fileName.split("-").filter { it.isNotBlank() }
                val filePathWithoutOldName = file.parent
                file.renameTo(File(filePathWithoutOldName, nameArray.joinToString("").capitalize()))
                println("Rename: ${File(filePathWithoutOldName, nameArray.joinToString("").capitalize())}")
            }
            if (file.isFile && file.name != "package-list") {
                if (file.name != "index.md") {
                    file.delete()
                    println("Deleted file: ${file.absolutePath}")
                } else {
                    var content = file.readText()
                    content = if (content.contains("[androidJvm]<br>")) {
                        content.replace("[androidJvm]<br>", "")
                    } else {
                        content.replace("[androidJvm]", "")
                    }
                    file.writeText(content)
                    println("Removed [androidJvm] from: ${file.absolutePath}")
                }
            }
        } catch (exception: Exception) {
            println("Error parsing file: $exception")
        }
    }
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