# Base image with JDK installed
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Install openssl and curl
RUN apt-get update && apt-get install -y openssl curl && apt-get clean

# Copy the keystore file to the container
COPY src/main/resources/keystore.p12 /app/keystore.p12

# Add the domain.crt file to the container
COPY certs/domain.crt /app/domain.crt

# Import the domain.crt into the Java truststore (cacerts)
RUN keytool -import -trustcacerts -alias my_domain_cert -file /app/domain.crt -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt

# Copy the Spring Boot application's jar to the container
COPY target/ImageService-0.0.1-SNAPSHOT.jar /app/ImageService.jar

# Copy the shell script into the container
COPY entrypoint.sh /app/entrypoint.sh

# Make the script executable
RUN chmod +x /app/entrypoint.sh

# Expose port 8080
EXPOSE 8080

# Set the entrypoint to the script
ENTRYPOINT ["/app/entrypoint.sh","java", "-jar", "/app/ImageService.jar"]
