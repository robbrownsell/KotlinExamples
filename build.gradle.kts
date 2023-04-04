val kotestVersion = "5.5.5"

plugins {
    kotlin("jvm") version "1.8.0"
    id("io.gitlab.arturbosch.detekt").version("1.22.0")
    application
}
group = "me.robertbrownsell"

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core-jvm:$kotestVersion")
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.22.0")
}

apply(plugin = "io.gitlab.arturbosch.detekt")

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}

