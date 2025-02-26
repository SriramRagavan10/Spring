package com.employee.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import com.student.entity.Student;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empSer;

	static Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	RestTemplate res;

	@PostMapping(value = "/insert")
	public String addEmployee(@RequestBody Employee e) throws NullPointerException {
		PropertyConfigurator.configure("srl.properties");
		log.info(empSer.addEmployee(e));
		return empSer.addEmployee(e);
	}

	@GetMapping(value = "/getById/{id}")
	public Employee getId(@PathVariable int id) {
		return empSer.getId(id);
	}

	@GetMapping(value = "/getAll")
	public List<Employee> getAll() {
		PropertyConfigurator.configure("srl.properties");
		log.info(empSer.getAll());
		return empSer.getAll();
	}

	@DeleteMapping(value = "/deleteById/{a}")
	public String delete(@PathVariable int a) {
		return empSer.delete(a);
	}

	@PutMapping(value = "/update")
	public String updateEmployee(@RequestBody Employee e) {
		return empSer.updateEmployee(e);
	}

	@PostMapping(value = "/insertAll")
	public String addAllEmp(@RequestBody List<Employee> e) throws Exception {
		return empSer.addAllEmp(e);
	}

	@GetMapping("/getByName/{name}")
	public List<Employee> getByName(@PathVariable String name) throws Exception {
		return empSer.getByName(name);
	}

	@GetMapping("/getByAge/{age}")
	public List<Employee> getByAge(@PathVariable int age) {
		return empSer.getByAge(age);
	}

	@GetMapping("/getBySalary/{salary}")
	public List<Employee> getBySalary(@PathVariable int salary) {
		return empSer.getBySalary(salary);
	}

	@GetMapping("/getByDesignation/{des}")
	public List<Employee> getByDesignation(@PathVariable String des) {
		return empSer.getByDesignation(des);
	}

	@GetMapping("/getByGender/{gen}")
	public List<Employee> getByGender(@PathVariable String gen) {
		return empSer.getByGender(gen);
	}

	@GetMapping("/getSal/{sal}")
	public List<String> getSal(@PathVariable int sal) {
		return empSer.getSal(sal);
	}

	@GetMapping("/getGen/{gen}")
	public List<String> getGen(@PathVariable String gen) {
		return empSer.getGen(gen);
	}

	@GetMapping("/getBySal")
	public List<Employee> getByBetSalary(@RequestParam int sal1, @RequestParam int sal2) {
		return empSer.getByBetSalary(sal1, sal2);
	}

	@GetMapping("/getByDes")
	public List<Employee> getByDes(@RequestParam String gen) {
		return empSer.getByDes(gen);
	}

	@GetMapping("/getTwo")
	public List<Object[]> getTwo(@RequestParam String name) {
		return empSer.getTwo(name);
	}

	@GetMapping("/getJpa")
	public List<Employee> getByJpa() {
		return empSer.getByJpa();
	}

	@GetMapping("/getName/{nam1}/{nam2}")
	public List<Employee> getFirstName(@PathVariable String nam1, @PathVariable String nam2) {
		return empSer.getFirstName(nam1, nam2);
	}

	@GetMapping("/getSal1/{sal}")
	public List<Employee> getSal1(@PathVariable int sal) {
		return empSer.getSal1(sal);
	}

	@GetMapping("/getLast")
	public List<Employee> getLastName(@RequestParam String w1, @RequestParam String w2) {
		return empSer.getLastName(w1, w2);
	}

	@GetMapping("getBetAge")
	public List<Employee> getBetAge(@RequestParam int a1, @RequestParam int a2) {
		return empSer.getBetAge(a1, a2);
	}

	@PostMapping("/getExc")
	public String age(@RequestBody Employee a) throws Exception {
		return empSer.age(a);
	}

	@GetMapping(value = "/getAllStudviaEmp")
	public List<Student> getAllStu() {
		String url = "http://localhost:8080/student/getAllStu";
		// RestTemplate res = new RestTemplate();	
		ResponseEntity<List<Student>> resp = res.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		List<Student> stu = resp.getBody();
		return stu;
	}

	@PostMapping(value = "/insertAllStudviaEmp")
	public String insertAllStu(@RequestBody List<Student> s) {
		String url = "http://localhost:8080/student/insertAll";
		ResponseEntity<String> resp = res.exchange(url, HttpMethod.POST, new HttpEntity<>(s), String.class);
		// ResponseEntity<String> resp = res.postForEntity(url, s, String.class);
		return resp.getBody();
	}

	@PutMapping(value = "/updateStudviaEmp")
	public String updateAllStu(@RequestBody List<Student> s) {
		String url = "http://localhost:8080/student/update";
		ResponseEntity<String> resp = res.exchange(url, HttpMethod.PUT, new HttpEntity<>(s), String.class);
		return resp.getBody();
	}

}
