package com.student.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao stuDao;

	public String insertAll(List<Student> s) {
		return stuDao.insertAll(s);
	}

	public List<Student> getAll() {
		return stuDao.getAll();
	}

	public List<Integer> passedOut(String n, String c) {
		List<Student> all = stuDao.getAll();
		return all.stream().filter(x -> x.getName().equalsIgnoreCase(n)).filter(x -> x.getCourse().equalsIgnoreCase(c))
				.map(x -> x.getYear()).toList();
	}

	public String update(List<Student> a) {
		return stuDao.update(a);
	}

	public Map<Integer, List<Student>> detail(String cou) {
		List<Student> all = stuDao.getAll();
		Map<Integer, List<Student>> det = all.stream().filter(x -> x.getCourse().equalsIgnoreCase(cou))
				.collect(Collectors.groupingBy(Student::getYear));
		return det;
	}

	public String delName(String name) {
		List<Student> all = stuDao.getAll();
		List<Student> a = all.stream().filter(x -> x.getName().equalsIgnoreCase(name)).toList();
		for (int i = 1; i < a.size(); i++) {
			Student s = a.get(i);
			Integer n = s.getId();
			stuDao.dele(n);
		}
		return "Deleted Successfull";
	}

}
