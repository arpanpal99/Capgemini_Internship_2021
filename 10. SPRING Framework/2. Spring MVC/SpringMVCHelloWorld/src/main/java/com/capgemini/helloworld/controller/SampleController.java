package com.capgemini.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class SampleController {
	String cityName="Kolkata";
	@RequestMapping("/cityname")
	public ModelAndView showCityName() {
		System.out.println("In Sample Controller");
		ModelAndView mv3 = new ModelAndView("helloworld");
		mv3.addObject("cityname",cityName);
		//mv.addObject("myname",name);
		return mv3;
	}
}
