FROM openjdk:17 as builder
WORKDIR /app
COPY build/libs/demo-0.1.jar .
ENTRYPOINT ["java", "-jar", "demo-0.1.jar"]