# Use OpenJDK 21 base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the build output JAR to the container
COPY build/libs/crm-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
