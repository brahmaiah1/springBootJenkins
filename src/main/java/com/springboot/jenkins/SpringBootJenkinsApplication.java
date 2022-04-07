package com.springboot.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {
 
private static final Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
 
    @PostConstruct
	public void init() {
		log.debug("appication started SpringBootJenkinsApplication");
	}
	public static void main(String[] args) {
		
		log.debug("appication started SpringBootJenkinsApplication inside main methode");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
