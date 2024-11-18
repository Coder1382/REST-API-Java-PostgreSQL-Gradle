plugins {
    id("java")
    /*id("com.gradleup.shadow") version "8.3.2"
    id("application")
    id("com.github.johnrengelman.shadow") version "6.0.0"*/
}
group = "rest"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("javax.servlet:servlet-api:2.5")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.google.errorprone:error_prone_annotations:2.35.1")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.postgresql:postgresql:42.7.4")
    implementation("jstl:jstl:1.2")
    runtimeOnly("org.apache.taglibs:taglibs-standard-impl:1.2.5")
    implementation("com.fasterxml.jackson.core:jackson-core:2.18.1")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.core:jackson-annotations")
    testImplementation("ch.qos.logback:logback-classic:1.5.12")
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("org.mockito:mockito-junit-jupiter:5.14.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.assertj:assertj-core:3.26.3")
    implementation("net.bytebuddy:byte-buddy:1.15.10")
    compileOnly("org.apache.sling:org.apache.sling.api:2.27.6")
    compileOnly("org.osgi:osgi.core:8.0.0")
    implementation("com.github.docker-java:docker-java-api:3.4.0")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("com.github.docker-java:docker-java-transport-zerodep:3.4.0")
    implementation("net.java.dev.jna:jna:5.15.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.3")
    testImplementation("org.testcontainers:testcontainers:1.20.3")
    testImplementation("org.testcontainers:postgresql:1.20.3")
    implementation("org.apache.tomcat:tomcat-servlet-api:9.0.93")
}
tasks.jar.configure {
    manifest {
        attributes(mapOf("Main-Class" to "tomcat/bin/startup.sh/org.apache.catalina.startup.Bootstrap"))
    }
}
tasks.test {
    useJUnitPlatform()
}