package com.capgemini.practice.Day06.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX_practiceValidation {

	private static final String regUserName = "^[A-Za-z0-9]{1,}[._-]{1}[A-Za-z0-9]{1}(.+){3,}$";
	private static final String regEmail = "^[A-Za-z0-9._$+]{4,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$";
	private static final String regPassword = "^([A-Za-z0-9]{7,}.[@#$%*^&+=]+)"; // arpArp9*5AS
	private static final String regCity = "^[A-Za-z]{3}$";
	private static final String regPinCode = "^[0-9]{6}$";
	private static final String regContact = "[789]{1}[0-9]{9}";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username: ");
		String userName = sc.nextLine();
		System.out.println(Pattern.matches(regUserName, userName)); // arpanPal91*

		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println(Pattern.matches(regEmail, email)); // arpanPal.91@gmail.com
		/*
		 * System.out.println("Enter password: "); String passWord = sc.nextLine();
		 * System.out.println(Pattern.matches(regPassword, passWord));
		 */
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println(Pattern.matches(regCity, city));

		System.out.println("Enter password: ");
		String pinCode = sc.nextLine();
		System.out.println(Pattern.matches(regPinCode, pinCode));

		System.out.println("Enter contact number: ");
		String contact = sc.nextLine();
		System.out.println(Pattern.matches(regContact, contact));

		sc.close();
	}

}
/*
 * arpan*Pal91 arpan_Pal91 arpan*$Pal91
 * 
 * 
 */
