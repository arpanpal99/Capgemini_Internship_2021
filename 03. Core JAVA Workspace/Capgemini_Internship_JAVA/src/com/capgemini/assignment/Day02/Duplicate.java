package com.capgemini.assignment.Day02;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: \n");
		int n = sc.nextInt(), arr[] = new int[10];
		while (n > 0) {
			int d = n % 10;
			arr[d]++;
			n /= 10;
		}
		int cnt = 0;
		for (int i = 0; i < 10; i++)
			if (arr[i] > 1) {
				System.out.println("Digit " + i + " is repeated " + arr[i] + " times.");
				cnt++;
			}
		if (cnt == 0)
			System.out.println("No digit is repeated");
		sc.close();
	}
}