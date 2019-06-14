package com.pasindu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JpaDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDateApplication.class, args);
	}

}
