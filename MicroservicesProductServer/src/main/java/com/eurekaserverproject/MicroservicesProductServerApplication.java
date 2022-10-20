package com.eurekaserverproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroservicesProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductServerApplication.class, args);
	}

}
