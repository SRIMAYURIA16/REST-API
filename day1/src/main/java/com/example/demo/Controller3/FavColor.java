package com.example.demo.Controller3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavColor {
String yourFavColor="Green";
@GetMapping("FavColor")
public String Color() {
	return "My Favorite Color is "+yourFavColor;
}
}
