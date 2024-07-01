package com.example.demo;


import org.slf4j.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class); 
	
	public void init() {
		log.info("Application started...");
	}
	
	public static void main(String[] args) {
		log.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
