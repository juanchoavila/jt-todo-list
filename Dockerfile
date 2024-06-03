# Build dev image
FROM maven:3.9.7-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Build final image
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY . .
COPY --from=build /app/target/*.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "./app.jar"]