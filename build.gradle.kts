plugins {
    kotlin("jvm") version "1.8.20"
    `java-library`
    `maven-publish`
}

group = "com.andriel"
version = "person"

publishing {
    repositories {
        maven {
            url = uri("file://${buildDir.absolutePath}/maven")
        }
    }
    publications {
        create<MavenPublication>("maven") {
            groupId ="com.andriel"
            artifactId = "person"
            version = "2"

            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

