package com.cg.msg;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				("message.xml");
		MessageSource messageSource = 
				(MessageSource) ctx.getBean
				("messageSource");
		Locale locale = new Locale("in","HN");//lang and country
		String msg = messageSource.getMessage
				("welcome.message",null,locale);
		System.out.println(msg);
	}
}
