plugins {
    kotlin("jvm") version "1.8.22"
    kotlin("kapt") version "1.8.22"
    id("application")
    id("com.ryandens.javaagent-application") version "0.3.2"
}

group = "spp.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://pkg.sourceplus.plus/sourceplusplus/probe-jvm")
}

dependencies {
    implementation("io.micronaut:micronaut-management:3.6.4")

    //attaches Source++ probe to the application
    javaagent("plus.sourceplus.probe:probe-jvm:0.7.10-SNAPSHOT")

    //used for the tail logs command
    implementation("org.apache.skywalking:apm-toolkit-logback-1.x:8.15.0")
    implementation("org.slf4j:slf4j-api:2.0.2")
    implementation("ch.qos.logback:logback-classic:1.4.1")

    //used for endpoint indicators
    implementation("io.micronaut:micronaut-http-server-netty:3.6.4")
    kapt("io.micronaut:micronaut-inject-java:3.6.4")
}

application {
    mainClass.set("spp.demo.Main")
    applicationName = "demo-kotlin"
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}
tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
}
