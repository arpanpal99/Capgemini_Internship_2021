package com.capgemini.assignment.Day05;

import java.util.Scanner;

public class D5C_PrintDuplicates {

	static void prDupli(String str) {

		char[] chArray = str.toCharArray();
		int i, flag = 0;
		System.out.println("Result:");
		for (i = 0; i < chArray.length - 1; i++) {
			int cnt = 1;
			for (int j = i + 1; j < chArray.length; j++) {
				if (chArray[i] == chArray[j] && chArray[i] > 33) {
					cnt++;
					chArray[j] = 33;
				}
			}
			if (cnt > 1) {
				System.out.println(chArray[i] + " is repeated " + cnt + " times");
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("No Duplicate Numbers");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		prDupli(str);
		sc.close();

	}

}
