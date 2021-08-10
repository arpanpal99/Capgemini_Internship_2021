package com.capgemini.practice.Day08.Exceptions;

import java.util.Scanner;

public class UserDefinedException_ValidateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
			if (age < 18)
				throw new UserDefinedException("age is below range");
			else if (age > 80)
				throw new UserDefinedException("age is out of range");
		} catch (UserDefinedException an) {
			System.out.println(an.getMessage());
		}

	}

}
