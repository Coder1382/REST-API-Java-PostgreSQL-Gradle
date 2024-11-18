FROM openjdk:21-jdk AS builder
COPY . /software
WORKDIR /software
#RUN apk add --update gradle
#RUN gradle bootJar
FROM openjdk:21-jdk
COPY --from=builder /software/build/libs/apiGradle-1.0-SNAPSHOT.jar api-gradle.jar
ENTRYPOINT ["java","-jar","api-gradle.jar"]
# EXPOSE 8080
# COPY target/myREST.war restapi.jar
# ENTRYPOINT ["java", "-jar", "restapi.jar"]
CMD [""]