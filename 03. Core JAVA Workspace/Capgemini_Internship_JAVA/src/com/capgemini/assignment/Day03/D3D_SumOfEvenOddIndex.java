package com.capgemini.assignment.Day03;

import java.util.Scanner;

public class D3D_SumOfEvenOddIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int evenSum = 0, oddSum = 0;
		for (i = 0; i < n; i++) {
			if (i % 2 == 0)
				evenSum += arr[i];
			else
				oddSum += arr[i];
		}
		System.out.println("Sum of all the even indices = " + evenSum);
		System.out.println("Sum of all the odd indices = " + oddSum);
		sc.close();
	}

}
