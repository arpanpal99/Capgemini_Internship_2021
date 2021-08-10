package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5L_DeleteWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		System.out.println("Enter the word to delete: ");
		String wrd = sc.nextLine();
		wrd += " ";
		if (str.contains(wrd))
			str = str.replace(wrd, "");

		System.out.println("Final string: \n" + str);
		sc.close();
	}

}
// The word malayalam is a Palindrome