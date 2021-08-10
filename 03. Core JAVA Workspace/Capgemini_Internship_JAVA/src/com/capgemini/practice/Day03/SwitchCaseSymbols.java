package com.capgemini.practice.Day03;

import java.util.Scanner;

public class SwitchCaseSymbols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] pasw = new char[10];
		int temp;
		System.out.println("Enter 10 characters or numbers or symbols: ");
		for (int i = 0; i < 10; i++)
			pasw[i] = sc.next().charAt(0);
		for (int i = 0; i < 10; i++) {
			char ch = pasw[i];
			if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105
					|| ch == 111 || ch == 117)
				temp = 1;
			else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
				temp = 2;
			else
				temp = 3;
			switch (temp) {
			case 1:
				System.out.println(ch + " is a Vowel");
				break;
			case 2:
				System.out.println(ch + " is a Consonant");
				break;
			case 3:
				System.out.println(ch + " is a Symbol");
				break;
			default:
				System.out.println("Default Case");
				break;
			}
		}
		sc.close();
	}

}
/*
 * a b c d e f g h i u 1 . = # @ A N [ u i
 */