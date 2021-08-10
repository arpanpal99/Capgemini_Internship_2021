package com.cg.lab2_Arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class L2A_SecondSmallest {

	static int getSecondSmallest(int[] arr, int n) {
		// Arrays.sort(arr);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i != j && arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		return arr[1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt(), i;
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out
				.println(L2A_SecondSmallest.getSecondSmallest(arr, n) + " is the second smallest element in the array");
		sc.close();
	}
}

/*
 * // Through ArrayList Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of array: "); int n = sc.nextInt(), i;
 * ArrayList<Integer> myList = new ArrayList<Integer>(5);
 * System.out.println("Enter " + n + " positive integers:"); for(i = 0; i < n;
 * i++) myList.add(sc.nextInt()); Collections.sort(myList);
 * System.out.println("Sorted Array:\n" + myList);
 */