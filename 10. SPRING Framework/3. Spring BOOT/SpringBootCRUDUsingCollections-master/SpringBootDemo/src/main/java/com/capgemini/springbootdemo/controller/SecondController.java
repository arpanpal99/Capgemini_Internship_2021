package com.capgemini.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hi from Second Controller";
	}
}
