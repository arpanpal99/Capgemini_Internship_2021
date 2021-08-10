package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5I_CountWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		String[] wordList = str.split("\\s+");
		System.out.println("Total number of words: " + wordList.length);
		sc.close();
	}

}
