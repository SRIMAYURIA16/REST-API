package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Baby;
import com.example.demo.service.BabyService;

@RestController
public class BabyController {
	@Autowired
	BabyService service;
	
	@PostMapping("/baby")
	public boolean create(@RequestBody Baby baby) {
		return service.addBaby(baby);
	}
	
	@GetMapping("/baby/{field}")
	public List<Baby> getSorted(@PathVariable String field){
		return service.getBabySorted(field);
	}
	
	@GetMapping("/baby/{offset}/{pagesize}")
	public List<Baby> getWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getBabyWithPagination(offset,pagesize);
	}
	
	@GetMapping("/baby/{offset}/{pagesize}/{field}")
	public List<Baby> getWithSortedPagination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getBabyWithPaginationAndSorting(offset, pagesize, field);
	}
}
