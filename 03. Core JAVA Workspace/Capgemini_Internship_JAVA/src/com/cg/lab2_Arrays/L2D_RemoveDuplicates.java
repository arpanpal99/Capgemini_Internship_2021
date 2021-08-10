package com.cg.lab2_Arrays;

import java.util.Scanner;

public class L2D_RemoveDuplicates {

	static int[] modifyArray(int[] arr) {
		int n = arr.length - 1, temp = n;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j] && arr[i] > 0) {
					for (int k = j; k < n - 1; k++)
						arr[k] = arr[k + 1];
					n--;
				}
			}
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i != j && arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
		arr[temp] = n;
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int len = sc.nextInt(), i;
		int[] arr = new int[len + 1];
		System.out.println("Enter " + len + " integers:");
		for (i = 0; i < len; i++)
			arr[i] = sc.nextInt();

		System.out.println("Result:");

		arr = modifyArray(arr);
		len = arr[len];

		for (i = 0; i < len; i++)
			System.out.println(arr[i]);
	}

}
/*
 * 32 56 36 32 56 85 45 32
 */