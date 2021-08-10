package com.capgemini.assignment.Day02;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = sc.nextInt();
		int x = num, y, sum = 0;
		while (x > 0) {
			y = x % 10;
			sum += y;
			x /= 10;
		}
		if (num % sum == 0)
			System.out.println(num + " is a Harshad Number.");
		else
			System.out.println(num + " is not a Harshad Number.");
		sc.close();
	}
}
