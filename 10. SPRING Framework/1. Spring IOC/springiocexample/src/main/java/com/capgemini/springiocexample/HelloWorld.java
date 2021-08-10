package com.capgemini.springiocexample;

public class HelloWorld {
	private String msg;

	public String getMsg() {
		System.out.println("Message = " + msg);
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
