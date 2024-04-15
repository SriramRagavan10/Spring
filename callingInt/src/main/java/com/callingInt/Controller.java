package com.callingInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	RestTemplate temp;

	@GetMapping(value = "/integer")
	public int getInteger() {
		String url = "http://localhost:8080/numb";
		int num = temp.exchange(url, HttpMethod.GET, null, int.class).getBody();
		return num + (num * 10 / 100);

	}

}
