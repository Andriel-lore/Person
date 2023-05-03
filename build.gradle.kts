plugins {
    kotlin("jvm") version "1.8.20"
    application
    `maven-publish`
}

group = "com.andriel"
version = "person"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId ="com.andriel"
            artifactId = "person"
            version = "1"

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

application {
    mainClass.set("MainKt")
}