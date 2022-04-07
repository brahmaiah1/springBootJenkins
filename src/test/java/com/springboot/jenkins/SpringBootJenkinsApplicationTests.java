package com.springboot.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		log.debug("inside SpringBootJenkinsApplicationTests");
	
	}

}
