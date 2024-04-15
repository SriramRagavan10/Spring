package com.twoConnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TwoController {

	@Autowired
	RestTemplate tem;

	@GetMapping(value = "/getTwo/{g}")
	public String getTwo(@PathVariable String g) {
		String s = "http://localhost:8080/getHello?name=" + g;
		String c = "http://localhost:8081/getWorld";
		// String url = (s) + " " + (c);
		ResponseEntity<String> ser = tem.exchange(s, HttpMethod.GET, null, String.class);
		ResponseEntity<String> ser1 = tem.exchange(c, HttpMethod.GET, null, String.class);
		String ab = ser.getBody();
		String cd = ser1.getBody();
		return ab + cd;
	}

}
