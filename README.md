Eureka Server
=

Create Eureka server that will be used by Eureka clients to connect to backend services.


Creating Docker Image
-

`docker build --build-arg JAR_FILE=target/server-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/eureka-server:latest .`

Run Docker Image
-

`docker run --publish 8761:8761 --hostname eureka-server --network spring-demo --name eureka-server -i -t spring-demo/eureka-server`

The host is used by the services to discover the Eureka server

DepShield
-

[![DepShield Badge](https://depshield.sonatype.org/badges/n002213f/spring-eureka-server/depshield.svg)](https://depshield.github.io)
