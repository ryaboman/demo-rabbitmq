FROM maven:3.8.5-openjdk-17 AS builder
COPY pom.xml /tmp/
COPY src /tmp/src
WORKDIR /tmp
RUN mvn clean package -Dmaven.test.skip

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder /tmp/target/producer-0.0.1-SNAPSHOT.jar /tmp/app.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "app.jar"]
