package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository empRepo;

	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Successfully Saved";
	}

	public Employee getId(int id) {
		return empRepo.findById(id).get();
	}

	public List<Employee> getAll() {
		return empRepo.findAll();
	}

	public String delete(int a) {
		empRepo.deleteById(a);
		return "Deleted Successfully";
	}

	public String updateEmployee(Employee e) {
		empRepo.save(e);
		return "Update Successfully";
	}

	public String addAllEmp(List<Employee> e) {
		empRepo.saveAll(e);
		return "All Details Successfully Saved";
	}

	public List<Employee> getByBetSalary(int sal1, int sal2) {
		return empRepo.getByBetSalary(sal1, sal2);
	}

	public List<Employee> getByDes(String gen) {
		return empRepo.getByDes(gen);
	}

	public List<Object[]> getTwo(String name) {
		return empRepo.getTwo(name);
	}

	public List<Employee> getByJpa() {
		return empRepo.getByJpa();
	}

	public List<Employee> getFirstName(String nam1, String nam2) {
		return empRepo.getFirstName(nam1, nam2);
	}

	public List<Employee> getSal1(int sal) {
		return empRepo.getSal1(sal);
	}

	public List<Employee> getLastName(String w1, String w2) {
		return empRepo.getLastName(w1, w2);
	}
	
	public List<Employee> getBetAge(int a1, int a2) {
		return empRepo.getBetAge(a1, a2);
	}
	
	public String age(Employee a) {
		empRepo.save(a);
		return "Save Successfully";
	}

}
