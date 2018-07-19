Eureka Server
=

Create Eureka server that will be used by Eureka clients to connect to backend services.


Creating Docker Image
-

`docker build --build-arg JAR_FILE=target/server-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/eureka-server:latest .`