package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5O_RepeatedWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		String[] wordList = str.split(" ");
		for (int i = 0; i < wordList.length - 1; i++) {
			int cnt = 0;
			for (int j = i + 1; j < wordList.length; j++) {
				if (wordList[i].equalsIgnoreCase(wordList[j])) {
					cnt++;
					wordList[j] = "-";
				}
			}
			if (!(wordList[i].equals("-")))
				System.out.println(wordList[i] + " is repeated " + (cnt + 1) + " times");
		}
		sc.close();
	}

}
