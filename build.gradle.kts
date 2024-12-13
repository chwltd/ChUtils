// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

buildscript {
    val kotlin_version by extra("1.6.10") // Changed from ext.kotlin_version
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.gradle) // Changed from single quotes to double quotes
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version") // Changed from single quotes to double quotes
    }
}