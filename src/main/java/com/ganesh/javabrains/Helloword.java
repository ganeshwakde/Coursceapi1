package com.ganesh.javabrains;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloword {

	@RequestMapping("/hi")   //http://localhost:8082/hi
	public String hii() {

		return "Hello";
	}
	
	
}
