plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.lastchance"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.lastchance"
        minSdk = 28
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation (libs.activity.ktx)
    implementation (libs.constraintlayout)
    implementation (libs.room.common)
    implementation (libs.room.rxjava3)
    implementation (libs.androidx.room.runtime)
    annotationProcessor (libs.androidx.room.compiler)
    implementation (libs.github.glide)
    annotationProcessor (libs.compiler)
    implementation (libs.rxjava3.rxandroid)
    implementation (libs.rxjava)
    implementation (libs.androidx.lifecycle.livedata.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.lifecycle.extensions)
    annotationProcessor (libs.androidx.lifecycle.compiler)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}