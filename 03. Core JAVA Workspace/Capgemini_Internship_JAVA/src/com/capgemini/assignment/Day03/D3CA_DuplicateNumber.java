package com.capgemini.assignment.Day03;

import java.util.Scanner;

public class D3CA_DuplicateNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i, flag = 0;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " positive integers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Result:");
		for (i = 0; i < n - 1; i++) {
			int cnt = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j] && arr[i] > 0) {
					cnt++;
					arr[j] = -1;
				}
			}
			if (cnt > 1) {
				System.out.println(arr[i] + " is repeated " + cnt + " times");
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("No Duplicate Numbers");
		sc.close();
	}

}
