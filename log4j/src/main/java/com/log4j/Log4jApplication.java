package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {

	static Logger log = Logger.getLogger(Log4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
		PropertyConfigurator.configure("log4j.properties");
		// BasicConfigurator.configure();
		log.info("This is imformation method");
		log.warn("This is warning method");
		log.error("This is error method");
		log.debug("This is Debugging method");
		log.fatal("This is critical error method");
	}

}
