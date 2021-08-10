package com.capgemini.assignment.Day03;

import java.util.Scanner;

public class D3E_ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Array : ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println(" ");

		for (i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
			System.out.print("Step " + (i + 1) + ": ");
			for (int j = 0; j < n; j++)
				System.out.print(arr[j] + " ");
			System.out.println(" ");
		}

		sc.close();
	}

}
