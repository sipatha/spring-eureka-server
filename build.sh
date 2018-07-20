#!/usr/bin/env bash
# docker ps -a -q --filter="name=eureka-server"
mvn clean install
docker build --build-arg JAR_FILE=target/server-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/eureka-server:latest .
docker rmi $(docker images -f 'dangling=true' -q)
# docker run --publish 8761:8761 --hostname eureka-server --network spring-demo --name eureka-server -i -t -d spring-demo/eureka-server
