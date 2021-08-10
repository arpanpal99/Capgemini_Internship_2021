package com.capgemini.RegisterUser;

public class MainClass {

	public static void main(String[] args) {
		RegisterUser ru = new RegisterUser();
		System.out.println(ru.displayDetails());
		System.out.println(ru.validateUserName("ammy_Adams"));
	}

}
