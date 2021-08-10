package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5J_CheckChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a index to check the character: ");
		int ind = sc.nextInt();
		char c = str.charAt(ind);
		if ((c >= 65 && c <= 91) || (c >= 97 && c <= 123))
			System.out.println("At index " + ind + ",\n'" + c + "' is an alphabet.");
		else if (c >= 48 && c <= 57)
			System.out.println("At index " + ind + ",\n'" + c + "' is a digit.");
		else
			System.out.println("At index " + ind + ",\n'" + c + "' is a symbol.");
		sc.close();
	}

}
//abcABC123$%^