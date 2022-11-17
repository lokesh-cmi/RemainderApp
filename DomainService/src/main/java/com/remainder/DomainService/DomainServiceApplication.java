package com.remainder.DomainService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DomainServiceApplication {

	public static final Logger logger = LogManager.getLogger(DomainServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DomainServiceApplication.class, args);
		System.out.println("Hello World");
		logger.warn("Info level log message");
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
