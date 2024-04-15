package com.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.entity.Car;
import com.car.repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository carRep;

	public String addCar(Car c) {
		carRep.save(c);
		return "Successfully Saved";
	}

	public String addCars(List<Car> c) {
		carRep.saveAll(c);
		return "All Cars Successfully Saved";
	}

	public String update(Car c) {
		carRep.save(c);
		return "Update Successfully";
	}

	public String dele(int c) {
		carRep.deleteById(c);
		return "DELETED SUCCESSFULLY";
	}

	public Car find(int a) {
		return carRep.findById(a).get();
	}

	public List<Car> findAll() {
		return carRep.findAll();
	}

}
