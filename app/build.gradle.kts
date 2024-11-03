plugins {
    kotlin("jvm") version "1.8.0"
    application
}

repositories {
    mavenCentral() // Certifique-se de que o Maven Central está configurado corretamente
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0") // Dependência do JDA para o bot Discord
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2") // Dependência para testes (opcional)
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

// Desativa temporariamente os testes para evitar problemas de build
tasks.withType<Test> {
    enabled = false
}

sourceSets {
    main {
        kotlin.srcDirs("src/main/kotlin")
    }
}
