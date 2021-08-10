package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5D_RemoveFirstFromSecond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String string1 = sc.next(); // abcdefghijk
		System.out.print("Enter the second string: ");
		String string2 = sc.next(); // dfj
		System.out.println("New string after removal is : " + remChars(string1, string2));
		sc.close();
	}

	static String remChars(String str1, String str2) {
		int count[] = new int[256], i, finalIndex = 0;
		for (i = 0; i < str2.length(); i++)
			count[str2.charAt(i)]++;
		char arrStr1[] = str1.toCharArray();
		for (char chItr : arrStr1)
			if (count[chItr] == 0)
				arrStr1[finalIndex++] = chItr;
		return (new String(arrStr1)).substring(0, finalIndex);
	}

}