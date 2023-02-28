package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarService service;
	
	@PostMapping("")
	public boolean create(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@GetMapping("")
	public List<Car> getAll(){
		return service.getAllCar();
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> getByOwners(@PathVariable int owners){
		return service.getCarByOwners(owners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable String address){
		return service.getCarByAddress(address);
	}
	
	@PutMapping("/{id}")
	public Car updateById(@PathVariable int id,@RequestBody Car car) {
		return service.updateCar(car);
		
	}
	
	@GetMapping("/carName/{carName}")
	public List<Car> getByCarName(@PathVariable String carName){
		return service.getCarByCarName(carName);
	}
	
	@GetMapping("/owners/{owners}/carType/{carType}")
	public List<Car> getByOwnersAndCarType(@PathVariable int owners,@PathVariable String carType){
		return service.getCarByOwnersAndCarType(owners, carType);
	}
}
