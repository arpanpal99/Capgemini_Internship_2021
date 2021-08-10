package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5B_RemoveDuplicates {

	public static String remDupli(String str) {

		char[] chArray = str.toCharArray();
		str = "";
		for (char chItr : chArray)
			if (str.indexOf(chItr) == -1)
				str += chItr;
		return str;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		System.out.println("String without duplicate characters = \n" + remDupli(str));
		sc.close();

	}

}
