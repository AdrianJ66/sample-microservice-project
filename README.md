# sample-microservice-project
Sample microservice project utilising Spring Boot, RabbitMq, PostgreSQL and Liquibase

To make running this project less complicated, I have created a "start_all.sh" shell script which takes care of building jars for music-service, radio-service and naming-server apps. After all needed jars are ready docker compose command is used to link it all together and pull images for postgres, zipkin and rabbit mq.

During the startup of the application liquibase is used to create tables and insert dummy data.
Added song titles are: 
- FirstSong
- SecondSong
- ThirdSong

This application serves two REST endpoints. One for music-service and one for radio-service. 

music-service: 
GET http://localhost:8000/music/song/FirstSong

radio-service:
GET http://localhost:8100/radio/song/SecondSong

Radio service calls music service internally using Feign framework. 

Here are some useful links that will let you check what is goin on inside the application.

Eureka Naming Server:
http://localhost:8761/

Zipkin server:
http://localhost:9411/zipkin/


I also added swagger documentation. It is accessible under the following links:
http://localhost:8000/swagger-ui/index.html
http://localhost:8100/swagger-ui/index.html




