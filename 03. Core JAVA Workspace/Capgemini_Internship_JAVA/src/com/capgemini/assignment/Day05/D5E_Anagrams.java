package com.capgemini.assignment.Day05;

import java.util.*;

public class D5E_Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String string1 = sc.next();
		System.out.print("Enter the second string: ");
		String string2 = sc.next();
		if (theseaAreAnagrams(string1, string2))
			System.out.println("The two strings are anagrams.");
		else
			System.out.println("The two strings are not anagrams.");
		sc.close();
	}

	static boolean theseaAreAnagrams(String s1, String s2) {
		char[] str1 = s1.toLowerCase().toCharArray(), str2 = s2.toLowerCase().toCharArray();
		if (str1.length != str2.length)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < str1.length; i++)
			if (str1[i] != str2[i])
				return false;
		return true;
	}
}

/*
 * abcdef AfEdCb
 */