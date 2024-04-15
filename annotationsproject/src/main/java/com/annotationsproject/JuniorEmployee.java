package com.annotationsproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("Junior")
public class JuniorEmployee implements Employee {

	public String getMessage() {
		return "This is Junior Employee";
	}

}
