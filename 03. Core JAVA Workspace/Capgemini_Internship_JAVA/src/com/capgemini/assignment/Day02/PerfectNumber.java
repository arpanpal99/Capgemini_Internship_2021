package com.capgemini.assignment.Day02;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), i, sum = 0;
		sc.close();
		for (i = 1; i < num; i++)
			if (num % i == 0)
				sum += i;
		if (sum == num)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");

	}
}