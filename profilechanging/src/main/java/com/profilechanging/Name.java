package com.profilechanging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	
	@Value("${myname}")
	String name;
	
	@GetMapping(value = "/getName")
	public String get() {
		return name;
	}

}
