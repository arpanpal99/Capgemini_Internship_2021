package com.capgemini.assignment.Day03;

import java.util.Scanner;

public class D3B_RemoveElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter an index to remove the \ncorresponding element: ");
		int ind = sc.nextInt();
		for (i = ind; i < n - 1; i++)
			arr[i] = arr[i + 1];

		System.out.println("The final array is:");
		for (i = ind; i < n - 1; i++)
			System.out.println(arr[i]);

		sc.close();
	}

}
