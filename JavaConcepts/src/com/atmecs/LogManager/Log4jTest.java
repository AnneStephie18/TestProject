package com.atmecs.LogManager;

import org.apache.log4j.Logger;

public class Log4jTest {
	private static Logger log = Logger.getLogger(Log4jTest.class);
	public static void main(String[] args) {
		
		log.debug("Log4j debug message test.");
		log.info("Log4j info message test.");
		log.warn("Log4j warn message test.");
		log.error("Log4j error message test.");
		log.fatal("Log4j fatal message test.");	
	}
}
