plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    kotlin("plugin.serialization") version "1.7.20"
    id("org.jlleitschuh.gradle.ktlint").version("10.3.0")
    id("io.ktor.plugin") version "2.1.3"
    application
}

application {
    mainClass.set("no.knowledge.fredag.ApplicationKt")
}

repositories {
    mavenCentral()
}

java.sourceCompatibility = JavaVersion.VERSION_17
group = "no.knowledge.fredag"

// versions
val ktor_version: String by project
val logback_version: String by project

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")

    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
