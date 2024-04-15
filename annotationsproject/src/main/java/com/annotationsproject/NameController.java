package com.annotationsproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class NameController {

	@Value("Sriram")
	String name;

//	@Value("${soul}")
//	String s;

	@Value("${number}")
	int no;

	@GetMapping(value = "/name")
	public String getName() {
		return name;
	}

	@Value("${soul}")
	@GetMapping(value = "/soul")
	public String gets(String s) {
		return s;
	}

	@GetMapping(value = "/numb")
	public int getNum() {
		return no;
	}

}
