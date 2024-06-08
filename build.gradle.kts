buildscript {
    dependencies {
        classpath(libs.google.services)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("androidx.navigation.safeargs") version "2.7.5" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
    id("com.google.devtools.ksp") version ("1.9.0-1.0.12") apply false
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

}