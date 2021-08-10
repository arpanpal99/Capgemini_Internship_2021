package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;

public class L1C_Fibonacci {

	static long recFibonacci(long n) {
		if (n == 0 || n == 1)
			return n;
		else
			return (recFibonacci(n - 1) + recFibonacci(n - 2));
	}

	static long iterFibonacci(long n) {
		if (n == 0 || n == 1)
			return n;
		else {
			long a = 0, b = 1, cnt = 1;
			while (cnt++ < n) {
				long temp = a;
				a = b;
				b = temp + a;
			}
			return b;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which Fibonacci Number you want to find: ");
		int num = sc.nextInt();
		System.out.println("The " + num + "th Fibonacci number by recursion is: \n" + recFibonacci(num));
		System.out.println("The " + num + "th Fibonacci number by iteration is: \n" + iterFibonacci(num));
		sc.close();

	}

}
