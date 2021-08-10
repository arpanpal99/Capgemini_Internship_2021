package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5N_CheckSpclChars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address: ");
		String email = sc.nextLine();
		if (email.contains("@") && email.contains("."))
			System.out.println("Email address contains '@' and '.'");
		else if (email.contains("@") && !(email.contains(".")))
			System.out.println("Email address contains '@' but not '.'");
		else if (email.contains(".") && !(email.contains("@")))
			System.out.println("Email address contains '.' but not '@'");
		else
			System.out.println("Email address doesn't contain '@' and '.'");
		sc.close();
	}

}
//arpanpal91@gmailcom