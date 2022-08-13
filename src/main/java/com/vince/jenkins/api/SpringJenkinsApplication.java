package com.vince.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
   public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Starting");
	}

	public static void main(String[] args) {
		logger.info("Executed");

		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
