import org.gradle.api.JavaVersion

object AppConfig {
    const val COMPILE_SDK = 33
    const val TARGET_SDK = 33
    const val MIN_SDK = 21
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    val SOURCE_COMPATIBILITY = JavaVersion.VERSION_1_8
    val TARGET_COMPATIBILITY = JavaVersion.VERSION_1_8
    const val JVM_TARGET = "1.8"
    const val KOTLIN_COMPILER_EXTENSION_VERSION = "1.3.2"
}