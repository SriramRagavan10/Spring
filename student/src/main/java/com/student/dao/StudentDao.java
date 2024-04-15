package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository stuRep;

	public String insertAll(List<Student> s) {
		stuRep.saveAll(s);
		return "All Information Successfully Saved";
	}

	public List<Student> getAll() {
		return stuRep.findAll();
	}

	public String update(List<Student> a) {
		stuRep.saveAll(a);
		return "Updates Successfull";
	}

	public String dele(int a) {
		stuRep.deleteById(a);
		return "Deleted Successfully";
	}

}
