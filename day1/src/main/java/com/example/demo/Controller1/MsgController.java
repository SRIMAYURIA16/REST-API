package com.example.demo.Controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgController {
	@GetMapping("/Welcome")
public String Msg() {
	return "Welcome to SpringBoot";
}
}
