package com.capgemini.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	String message = "Welcome to Capgemini!!!";
	String name="Rama";
	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("In HelloWorld Controller");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("messagetojsp",message);
		mv.addObject("myname",name);
		return mv;
	}
	
	@RequestMapping("/myname")
	public ModelAndView showMyName() {
		System.out.println("In HelloWorld Controller showMyName method");
		ModelAndView mv1 = new ModelAndView("printname");
		mv1.addObject("myname",name);
		return mv1;
	}
	
	

}
