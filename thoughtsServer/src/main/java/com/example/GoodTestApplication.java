package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodTestApplication {

	private static final Logger logger = LogManager.getLogger(GoodTestApplication.class);
	public static void main(String[] args) {
		logger.info(" starting app");
		SpringApplication.run(GoodTestApplication.class, args);
		logger.info(" Started  app");
	}
}
