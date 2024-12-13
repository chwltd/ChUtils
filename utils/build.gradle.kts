plugins {
    alias(libs.plugins.android.application)
    id("maven-publish")
}

android {
    namespace = "com.chwltd.utils"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.chwltd.utils"
        minSdk = 29
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
    publishing {
        publications {
            // Creates a Maven publication called "release".
            create<MavenPublication>("release") {
                groupId = "com.github.chwltd"
                artifactId = "ChUtils"
                version = "1.0.6"
            }
        }
    }

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}