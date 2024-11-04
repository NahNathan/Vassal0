plugins {
    kotlin("jvm") version "1.8.0"
    application
}

repositories {
    mavenCentral() 
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2") 
    implementation("com.typesafe:config:1.4.1")
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<Test> {
    enabled = false
}

sourceSets {
    main {
        kotlin.srcDirs("src/main/kotlin")
    }
}
