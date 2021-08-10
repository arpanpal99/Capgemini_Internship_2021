package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;

public class L1E_DivisibleBy3or5 {

	static int calculateSum(int n) {
		int sum = 0, cnt = 1, num = 1;
		while (cnt <= n) {
			if (num % 3 == 0 || num % 5 == 0) {
				sum += num;
				cnt++;
			}
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values required: ");
		int num = sc.nextInt();
		System.out
				.println("The sum of first " + num + " numbers\nwhich are divisible by 3 or 5 = " + calculateSum(num));
		sc.close();
	}
}