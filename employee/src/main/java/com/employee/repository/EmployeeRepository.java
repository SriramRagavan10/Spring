package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from employees where salary>=? and salary<=?", nativeQuery = true)
	public List<Employee> getByBetSalary(int sal1, int sal2);

	@Query(value = "select * from employees where gender like ? order by age desc", nativeQuery = true)
	public List<Employee> getByDes(String gen);

	@Query(value = "select age,designation from employees where first_name like ?", nativeQuery = true)
	public List<Object[]> getTwo(String name);

	@Query(value = "select e from Employee e")
	public List<Employee> getByJpa();

	@Query(value = "select e from Employee e where e.firstName like ?1 and e.lastName like ?2")
	public List<Employee> getFirstName(String nam1, String nam2);

	@Query(value = "select e from Employee e where e.salary =?1")
	public List<Employee> getSal1(int sal);

	@Query(value = "select e from Employee e where e.firstName like ?1% and e.lastName like %?2")
	public List<Employee> getLastName(String w1, String w2);

	@Query(value = "select e from Employee e where e.age between ?1 and ?2")
	public List<Employee> getBetAge(int a1, int a2);
}
