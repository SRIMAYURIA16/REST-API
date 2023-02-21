package com.example.demo.Controllers1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class valueannotation {
@Value("${greeting.message}")
private String s;
@GetMapping("/annot")
public String annot() {
	return s;
}
}
