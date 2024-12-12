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
        create<MavenPublication>("release") {
            groupId = "com.github.chwltd"
            artifactId = "chutils"
            version = "1.0.1"

            // Specify what to publish
            // For an Android library:
            // afterEvaluate {
            //     artifact(tasks.getByName("bundleReleaseAar"))
            // }
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