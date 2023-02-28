package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository repository;
	
	public boolean addCar(Car car) {
		repository.save(car);
		return true;
	}
	
	public List<Car> getAllCar(){
		return repository.findAll();
	}
	
	public Car updateCar(Car car) {
		repository.save(car);
		return car;
	}
	
	public List<Car> getCarByOwners(int owners){
		return repository.findByOwners(owners);
	}
	
	public List<Car> getCarByAddress(String address){
		return repository.findByAddress(address);
	}
	
	public List<Car> getCarByCarName(String carName){
		return repository.findByCarName(carName);
	}
	
	public List<Car> getCarByOwnersAndCarType(int owners,String carType){
		return repository.findByOwnersAndCarType(owners, carType);
	}
}
