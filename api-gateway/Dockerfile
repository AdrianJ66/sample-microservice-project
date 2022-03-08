FROM openjdk:17-alpine
ADD target/api-gateway.jar api-gateway.jar
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
EXPOSE 8765