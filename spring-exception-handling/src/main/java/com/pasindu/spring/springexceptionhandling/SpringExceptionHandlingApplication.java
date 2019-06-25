package com.pasindu.spring.springexceptionhandling;

import com.pasindu.spring.springexceptionhandling.service.UserService;
import com.pasindu.spring.springexceptionhandling.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringExceptionHandlingApplication {

	/*@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringExceptionHandlingApplication.class, args);
	}

}
