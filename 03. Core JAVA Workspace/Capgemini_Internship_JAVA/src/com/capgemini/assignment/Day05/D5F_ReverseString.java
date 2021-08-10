package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5F_ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = sc.nextLine();
		System.out.println("Reverse String : " + reverseMe(input));
		sc.close();
	}

	static String reverseMe(String str) {
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reversedStr += str.charAt(i);
		return reversedStr;
	}

}