FROM openjdk:17-alpine
ADD target/naming-server.jar naming-server.jar
ENTRYPOINT ["java", "-jar", "naming-server.jar"]
EXPOSE 8761