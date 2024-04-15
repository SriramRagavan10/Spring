package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.exception.AgeNotFoundException;
import com.employee.exception.NoDataException;
import com.student.entity.Student;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;
	
	RestTemplate res;
	Student stu;

	public String addEmployee(Employee e) throws NullPointerException {
		if (e.getGender() == null) {
			throw new NullPointerException("Please Enter Gender");
		} else {
			return empDao.addEmployee(e);
		}
	}

	public Employee getId(int id) {
		return empDao.getId(id);
	}

	public List<Employee> getAll() {
		return empDao.getAll();
	}

	public String delete(int a) {
		return empDao.delete(a);
	}

	public String updateEmployee(Employee e) {
		return empDao.updateEmployee(e);
	}

	public String addAllEmp(List<Employee> e) throws Exception {
		int count = 0;
		for (Employee x : e) {
			if (x.getAge() < 18) {
				count--;
			} else {
				count++;
			}
		}
		if (count == e.size()) {
			return empDao.addAllEmp(e);
		} else {
			throw new AgeNotFoundException("One Of the Object's age is lessthan 18");
		}
	}

	public List<Employee> getByName(String name) throws Exception {
		List<Employee> emp = empDao.getAll();
		List<Employee> temp1 = emp.stream().filter(x -> x.getFirstName().equals(name)).toList();
		if (temp1.isEmpty()) {
			throw new NoDataException("Name Not Found");
		}
		return temp1;
	}

	public List<Employee> getByAge(int age) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getAge() == age).toList();
	}

	public List<Employee> getBySalary(int salary) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getSalary() == salary).toList();
	}

	public List<Employee> getByDesignation(String des) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getDesignation().equalsIgnoreCase(des)).toList();
	}

	public List<Employee> getByGender(String gen) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getGender().equalsIgnoreCase(gen)).toList();
	}

	public List<String> getSal(int sal) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getSalary() > sal).map(x -> x.getDesignation()).toList();
	}

	public List<String> getGen(String gen) {
		List<Employee> emp = empDao.getAll();
		return emp.stream().filter(x -> x.getGender().equalsIgnoreCase(gen)).map(x -> x.getFirstName()).toList();
	}

	public List<Employee> getByBetSalary(int sal1, int sal2) {
		return empDao.getByBetSalary(sal1, sal2);
	}

	public List<Employee> getByDes(String gen) {
		return empDao.getByDes(gen);
	}

	public List<Object[]> getTwo(String name) {
		return empDao.getTwo(name);
	}

	public List<Employee> getByJpa() {
		return empDao.getByJpa();
	}

	public List<Employee> getFirstName(String nam1, String nam2) {
		return empDao.getFirstName(nam1, nam2);
	}

	public List<Employee> getSal1(int sal) {
		return empDao.getSal1(sal);
	}

	public List<Employee> getLastName(String w1, String w2) {
		return empDao.getLastName(w1, w2);
	}

	public List<Employee> getBetAge(int a1, int a2) {
		return empDao.getBetAge(a1, a2);
	}

	public String age(Employee a) throws Exception {
		try {
			if (a.getAge() > 18) {
				return empDao.age(a);
			} else {
				throw new AgeNotFoundException("Age Not Found");
			}
		} catch (Exception e) {
			return "Age is Below 18";
		}
	}

}
