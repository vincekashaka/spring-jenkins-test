package com.vince.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	public  contextLoads() {
		logger.info("Test case executing");
		logger.info("Test case 2 executing");

		assertEquals(true, true);
	}

}
