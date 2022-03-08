#!/bin/bash

echo "Starting image preparation..."

cd ./music-service
./mvnw clean package -DskipTests

cd ../radio-service
./mvnw clean package -DskipTests

cd ../naming-server
./mvnw clean package -DskipTests

cd ../api-gateway
./mvnw clean package -DskipTests

echo "Images prepared..."
cd ..
echo "----- Starting docker compose -----"
docker-compose up --build