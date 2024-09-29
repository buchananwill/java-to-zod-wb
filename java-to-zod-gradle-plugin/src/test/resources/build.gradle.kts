import cz.habarta.typescript.generator.*

plugins {
    id("java")
    id("cz.habarta.typescript-generator") version "3.2.1263"
    id("java-to-zod-gradle-plugin") version "0.7.0-SNAPSHOT"
}

dependencies {
    implementation("cz.habarta.typescript-generator:typescript-generator-core:3.2.1263")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<sh.ivan.zod.GenerateZodSchemas> {
    outputFile = file("${'$'}buildDir/java-to-zod/generated-schemas.ts")
    jsonLibrary = JsonLibrary.jackson2
    classes = mutableListOf("sh.ivan.zod.dto.TestPersonClass")
}
