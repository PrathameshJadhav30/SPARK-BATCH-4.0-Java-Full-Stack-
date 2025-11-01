# Base image with JDK (correct spelling and official image name)
FROM eclipse-temurin:21-jdk

# Working directory inside the container
WORKDIR /app

# Copy JAR file from target folder to container
COPY target/Docker-Demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
