FROM openjdk:17-alpine
ADD target/radio-service.jar radio-service.jar
ENTRYPOINT ["java", "-jar", "radio-service.jar"]
EXPOSE 8100