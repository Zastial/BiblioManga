import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
    id("org.openjfx.javafxplugin") version "0.0.7"
}

group = "me.sasan"
version = "1.0-SNAPSHOT"

javafx {
    // will pull in transitive modules
    modules("javafx.controls", "javafx.fxml") // replace with what you modules need

    // another option is to use:
    // modules = listOf("javafx.controls", "javafx.fxml")

    version = "12.0.1" // or whatever version you're using
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/com.kttdevelopment/mal4j
    implementation("com.kttdevelopment:mal4j:2.7.4")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}