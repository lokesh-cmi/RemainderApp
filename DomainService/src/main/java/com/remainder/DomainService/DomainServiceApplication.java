package com.remainder.DomainService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DomainServiceApplication {

	public static final Logger logger = LogManager.getLogger(DomainServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DomainServiceApplication.class, args);
		System.out.println("Hello World");
		logger.info("Info level log message");
	}

}
