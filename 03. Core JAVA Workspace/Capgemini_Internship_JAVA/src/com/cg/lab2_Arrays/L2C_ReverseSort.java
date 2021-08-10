package com.cg.lab2_Arrays;

import java.util.Scanner;

public class L2C_ReverseSort {

	static int[] getSorted(int[] arr) {

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			String temp = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(temp);
			sb.reverse();
			temp = sb.toString();
			arr[i] = Integer.parseInt(temp);
		}
		for (int i = 0; i < len; i++)
			for (int j = 0; j < len; j++)
				if (i != j && arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		arr = getSorted(arr);

		System.out.println("\nAfter reversing the digits,\nthe sorted array: ");
		for (i = 0; i < n; i++)
			System.out.println(arr[i]);

	}

}

/*
 * 98562 25693 6541 25 8973 26998291 62 2
 */