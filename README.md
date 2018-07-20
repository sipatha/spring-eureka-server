Eureka Server
=

Create Eureka server that will be used by Eureka clients to connect to backend services.


Creating Docker Image
-

`docker build --build-arg JAR_FILE=target/server-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/eureka-server:latest .`

Run Docker Image
-

`docker run -p 8761:8761 -t spring-demo/eureka-server -h eureka.server.local --network spring-demo --name eureka.server.local`

The host is used by the services to discover the Eureka server

