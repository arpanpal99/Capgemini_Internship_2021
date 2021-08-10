package com.capgemini.springiocexampleusingxml;

public class WelcomeMessage {
	
	private String message;
	private String name;

	public String getMessage() {
		System.out.println("Message = "+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
