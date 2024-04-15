package com.twoConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TwoConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoConnectApplication.class, args);
	}
	
	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}

}
