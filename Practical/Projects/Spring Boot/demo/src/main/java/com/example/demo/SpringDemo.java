package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class SpringDemo {
	@GetMapping("/hi")
	public String sayHi() {
		
		System.out.println("Hello !!");
		return "<h1>Hello, Welcome to Spring Boot World</h1>";
		
	}
}
