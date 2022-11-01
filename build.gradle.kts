plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    kotlin("plugin.serialization") version "1.7.20"
    id("org.jlleitschuh.gradle.ktlint").version("10.3.0")
}

repositories {
    mavenCentral()
}

java.sourceCompatibility = JavaVersion.VERSION_17
group = "no.knowledge.fredag"

// versions
val ktorVersion: String by project
