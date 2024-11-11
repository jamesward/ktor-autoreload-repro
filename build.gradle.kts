plugins {
    kotlin("jvm") version "2.0.21"
    application
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.0.1")
    implementation("io.ktor:ktor-server-cio:3.0.1")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.12")
}

application {
    mainClass = "MainKt"
}

tasks.named<JavaExec>("run") {
    jvmArgs = listOf("-Dio.ktor.development=true")
}
