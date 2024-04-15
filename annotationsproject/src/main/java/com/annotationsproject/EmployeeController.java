package com.annotationsproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Qualifier("Senior")
	@Autowired
	Employee e;

	@GetMapping(value = "/getMessage")
	public String getMessage() {
		return e.getMessage();
	}

}
