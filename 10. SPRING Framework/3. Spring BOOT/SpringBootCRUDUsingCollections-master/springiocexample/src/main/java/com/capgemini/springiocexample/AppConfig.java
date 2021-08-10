package com.capgemini.springiocexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public HelloWorld helloworld() {
		HelloWorld hw = new HelloWorld();
		hw.setMsg("I am hello world bean");
		return hw;
	}
	
	@Bean
	public Message messageBean() {
		Message msg = new Message();
		msg.setSendMsg("Hello from message bean class");
		return msg;
	}

}
