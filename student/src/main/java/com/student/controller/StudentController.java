package com.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService stuSer;

	@PostMapping("/insertAll")
	public String insertAll(@RequestBody List<Student> s) {
		return stuSer.insertAll(s);
	}

	@GetMapping(value = "/getAllStu")
	public List<Student> getAll() {
		return stuSer.getAll();
	}

	@GetMapping("/passedOut/{n}/{c}")
	public List<Integer> passedOut(@PathVariable String n, @PathVariable String c) {
		return stuSer.passedOut(n, c);
	}

	@PutMapping("/update")
	public String update(@RequestBody List<Student> a) {
		return stuSer.update(a);
	}

	@GetMapping("/detail/{cou}")
	public Map<Integer, List<Student>> detail(@PathVariable String cou) {
		return stuSer.detail(cou);
	}

	@DeleteMapping("/delName/{name}")
	public String delName(@PathVariable String name) {
		return stuSer.delName(name);
	}

}
