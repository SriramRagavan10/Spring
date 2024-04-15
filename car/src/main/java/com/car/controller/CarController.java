package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Car;
import com.car.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarService carSer;

	@PostMapping("/insert")
	public String addCar(@RequestBody Car c) {
		return carSer.addCar(c);
	}

	@PostMapping("/insertAll")
	public String addCars(@RequestBody List<Car> c) {
		return carSer.addCars(c);
	}

	@PutMapping("/update")
	public String update(@RequestBody Car c) {
		return carSer.update(c);
	}

	@DeleteMapping("/delete/{c}")
	public String dele(@PathVariable int c) {
		return carSer.dele(c);
	}

	@GetMapping("/find/{a}")
	public Car find(@PathVariable int a) {
		return carSer.find(a);
	}

	@GetMapping("/findAll")
	public List<Car> findAll() {
		return carSer.findAll();
	}

}
