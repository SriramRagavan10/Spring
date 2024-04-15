package com.annotationsproject;

import org.springframework.stereotype.Component;

@Component("Senior")
public class SeniorEmployee implements Employee {
	
	public String getMessage() {
		return "This is Senior Employee";
	}

}
