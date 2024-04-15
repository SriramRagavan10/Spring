package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dao.CarDao;
import com.car.entity.Car;

@Service
public class CarService {

	@Autowired
	CarDao carDao;

	public String addCar(Car c) {
		return carDao.addCar(c);
	}

	public String addCars(List<Car> c) {
		return carDao.addCars(c);
	}

	public String update(Car c) {
		return carDao.update(c);
	}

	public String dele(int c) {
		return carDao.dele(c);
	}

	public Car find(int a) {
		return carDao.find(a);
	}

	public List<Car> findAll() {
		return carDao.findAll();
	}

}
