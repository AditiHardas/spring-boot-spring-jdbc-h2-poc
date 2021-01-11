package com.assignment.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootApp {

	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootApp.class);
	
	public static void main(String[] args) {
		LOGGER.info("Starting spring boot application");
		
		System.setProperty("server.servlet.context-path", "/SpringBootApp");
		SpringApplication.run(SpringBootApp.class, args);
	}

}
