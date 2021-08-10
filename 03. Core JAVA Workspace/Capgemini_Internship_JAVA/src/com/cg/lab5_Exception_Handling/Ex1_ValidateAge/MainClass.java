package com.cg.lab5_Exception_Handling.Ex1_ValidateAge;

import java.util.Scanner;

public class MainClass {
	static void validate(int age) throws InvalidAgeException {
		if (age < 15)
			throw new InvalidAgeException("\n* Exception cause: Age is less than 15.");
		else
			System.out.println("Welcome to Vote!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		try {
			validate(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Exception occurred. Age is below the limit.\n" + e);
			System.out.println("------------------------------------------");
		}
		sc.close();
	}
}