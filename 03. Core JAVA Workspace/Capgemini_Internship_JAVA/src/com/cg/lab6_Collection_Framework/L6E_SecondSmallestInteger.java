package com.cg.lab6_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L6E_SecondSmallestInteger {


	private static int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> arrayList  = new ArrayList<Integer>();
		for(int element: arr) arrayList.add(element);
		
		Collections.sort(arrayList);
		
		return arrayList.get(1);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt(), arr[] = new int[n];
		System.out.println("Enter " + n + " elements in the array: ");
		for(int i = 0; i<arr.length; i++) arr[i]= sc.nextInt();
		
		System.out.println("The second smallest integer in the array: " + getSecondSmallest(arr));
		sc.close();
		
	}

}
