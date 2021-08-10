package com.capgemini.assignment.Day02;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = sc.nextInt(), temp = num, d = 0, sum = 0;
		String s = Integer.toString(num);
		int len = s.length();

		while (temp > 0) {
			d = temp % 10;
			sum = sum + (int) Math.pow(d, len);
			len--;
			temp = temp / 10;
		}

		if (sum == num)
			System.out.println(num + " is a Disarium Number.");
		else
			System.out.println(num + " is not a Disarium Number.");
		sc.close();
	}
}
