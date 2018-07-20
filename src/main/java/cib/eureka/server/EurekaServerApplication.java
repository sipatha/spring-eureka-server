package cib.eureka.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	@Autowired
	private PropertiesService service;

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

	void test() {
		service.debug();
	}

}
