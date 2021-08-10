package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5K_ExtractPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter beginning index for the substring: ");
		int bInd = sc.nextInt();
		System.out.println("Enter closing index for the substring: ");
		int cInd = sc.nextInt();

		String subStr = str.substring(bInd, cInd + 1);
		int subStrLen = subStr.length() - 1;
		for (int i = 0; i <= subStrLen / 2 + 1; i++)
			if (subStr.charAt(i) != subStr.charAt(subStrLen - i)) {
				System.out.println("String \"" + subStr + "\" is not a Palindrome");
				System.exit(0);
			}
		System.out.println("String \"" + subStr + "\" is a Palindrome");
		sc.close();
	}

}
// MynameIsArpanPal
// The word malayalam is a Palindrome 9 17