package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5G_NonRepeatingChars {

	static void findNonRepeatingChars(String str) {
		System.out.println("The non-repeating characters in " + str + "are: ");
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		for (int i = 0; i < 256; i++)
			if (count[i] == 1)
				System.out.print((char) (i) + " ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		findNonRepeatingChars(str);
		sc.close();

	}

}
