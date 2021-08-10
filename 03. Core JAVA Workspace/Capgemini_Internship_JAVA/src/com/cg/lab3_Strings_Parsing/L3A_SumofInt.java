package com.cg.lab3_Strings_Parsing;

import java.util.*;

public class L3A_SumofInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line full of integers\nseperated by whitespace: \n");
		String str = sc.nextLine();

		listIntegers(str);
		integerSum(str);

		sc.close();
	}

	static void listIntegers(String str) {

		System.out.println("\nThe intergers are as follows:");
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

	static void integerSum(String str) {

		StringTokenizer st1 = new StringTokenizer(str, " ");
		int sum = 0;
		while (st1.hasMoreTokens()) {
			sum += Integer.parseInt(st1.nextElement().toString());
		}
		System.out.println("\nSum of all integers is = " + sum);

	}

}
// 14 15 24 21 41