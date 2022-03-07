FROM openjdk:17-alpine
ADD target/music-service.jar music-service.jar
ENTRYPOINT ["java", "-jar", "music-service.jar"]
EXPOSE 8000