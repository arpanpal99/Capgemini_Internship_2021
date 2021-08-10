package com.cg.lab2_Arrays;

import java.util.Scanner;

public class L2B_SortStrings {

	static String[] sortStrings(String[] arr) {

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i <= len / 2)
				arr[i] = arr[i].toUpperCase();
			else
				arr[i] = arr[i].toLowerCase();
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String array: ");
		int i, n = sc.nextInt();
		String[] arr = new String[n + 1];
		System.out.println("Enter " + n + " strings in the array:");
		for (i = 0; i <= n; i++)
			arr[i] = sc.nextLine();

		arr = sortStrings(arr);

		System.out.println("\nThe sorted String Array is: ");
		for (i = 0; i <= n; i++)
			System.out.println(arr[i]);
	}

}
/*
 * atnbgyn juymnh vteacw 5nytb bumu6rt tymnbt3 huyjh298252 962929
 */