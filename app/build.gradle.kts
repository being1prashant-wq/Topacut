plugins {
    id("com.android.application")
}

android {
    namespace = "com.topacut.app"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.topacut.app"
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
