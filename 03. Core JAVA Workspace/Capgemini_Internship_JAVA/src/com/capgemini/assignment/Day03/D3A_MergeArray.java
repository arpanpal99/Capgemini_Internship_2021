package com.capgemini.assignment.Day03;

import java.util.Scanner;

public class D3A_MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int n1 = sc.nextInt(), i;
		int[] arr1 = new int[n1];
		System.out.println("Enter " + n1 + " numbers:");
		for (i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();

		System.out.println("Enter the size of the second array: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter " + n2 + " numbers:");
		for (i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();

		int size = n1 + n2;
		int[] array = new int[size];
		for (i = 0; i < size; i++) {
			if (i < n1)
				array[i] = arr1[i];
			else
				array[i] = arr2[i - n1];
		}
		System.out.println("The merged array is:");
		for (i = 0; i < size; i++)
			System.out.println(array[i]);

		sc.close();
	}

}
