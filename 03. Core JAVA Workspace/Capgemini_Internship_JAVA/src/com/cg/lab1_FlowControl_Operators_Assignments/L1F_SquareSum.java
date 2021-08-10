package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;

public class L1F_SquareSum {

	static int squareSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i * i;
		return sum;
	}

	static int sumSquare(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum * sum;
	}

	static int calculateDifference(int n) {
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= n; i++)
			sum1 += i * i;
		for (int i = 1; i <= n; i++)
			sum2 += i;
		sum2 *= sum2;
		int sum = sum2 - sum1;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The difference between the square of the sum "
				+ "\nand the sum of the squares of the \nfirst " + num + " natural numbers = " + sumSquare(num) + "-"
				+ squareSum(num) + " = " + calculateDifference(num));
		sc.close();
	}
}
