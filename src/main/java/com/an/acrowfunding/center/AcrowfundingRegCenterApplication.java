package com.an.acrowfunding.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AcrowfundingRegCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcrowfundingRegCenterApplication.class, args);
	}
}
