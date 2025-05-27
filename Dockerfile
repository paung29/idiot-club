# Stage 1 1: Build the application
FROM eclipse-temurin:21-jdk-alpine AS build
RUN apk add --no-cache maven
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 1 1: Build the application
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/Idiot-Club-01-0.0.1-SNAPSHOT.jar idiot-aws.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "idiot-aws.jar"]




