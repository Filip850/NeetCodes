plugins {
    java
    id("com.adarshr.test-logger") version "3.2.0"
}

group = "pl.filip850"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = false
        events("passed", "failed", "skipped")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.SHORT
    }
}

testlogger {
    theme = com.adarshr.gradle.testlogger.theme.ThemeType.STANDARD
    showSummary = true
    showPassed = true
    showFailed = true
    showSkipped = false
}
