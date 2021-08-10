package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5A_MaxOcur {

	public static char MaxOcur(String s) {

		int[] count = new int[256];
		int max = -1, i;
		for (i = 0; i < s.length(); i++)
			count[s.charAt(i)]++;

		char result = ' ';
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (max < count[ch]) {
				max = count[ch];
				result = ch;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();

		System.out.println("Maximum occuring character in the string is '" + MaxOcur(str) + "'.");

		sc.close();
	}

}