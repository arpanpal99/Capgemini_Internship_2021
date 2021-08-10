package com.capgemini.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hi from Spring Boot Application";
	}
	
	@RequestMapping("/mycity")
	public String myCity() {
		String name = "Rama";
		int age = 45;
		return name + age;
	}


}
