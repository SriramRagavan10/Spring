package com.callingInt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Template {

	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}

}
