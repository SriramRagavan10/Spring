package com.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class World {
	
	@GetMapping(value = "/getWorld")
	public String getWorld() {
		return "World";
	}
	

}
