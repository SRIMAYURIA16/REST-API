package com.example.demo.Controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	String studentName="IAmNeo";
	@GetMapping("/StudentName")
public String Name() {
		return "Welcome "+studentName;
	}
}
