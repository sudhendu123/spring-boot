package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.property.ConfigProperties;

@EnableConfigurationProperties({ConfigProperties.class})
@SpringBootApplication
public class GoodTestApplication {

	private static final Logger logger = LogManager.getLogger(GoodTestApplication.class);
	public static void main(String[] args) {
		logger.info(" starting app");
		SpringApplication.run(GoodTestApplication.class, args);
		logger.info(" Started  app");
	}
	
	@Bean
	 public WebMvcConfigurer corsConfigurer() {
	       return new WebMvcConfigurerAdapter() {
	           @Override
	           public void addCorsMappings(CorsRegistry registry) {
	               registry.addMapping("/**")
	               .allowedMethods("DELETE")
	               .allowedOrigins("http://do.com")
	               .allowedHeaders("*");
	           }
	       };
	   }
}
