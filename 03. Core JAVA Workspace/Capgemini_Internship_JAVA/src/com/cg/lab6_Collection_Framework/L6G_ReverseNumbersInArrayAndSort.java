package com.cg.lab6_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L6G_ReverseNumbersInArrayAndSort {

	private static int[] getSorted(int[] arr) {
		
		// ArrayList mainly for sorting
		ArrayList<Integer> arrayList = new ArrayList<Integer>();	
		for(int itr : arr) {
			StringBuffer sBuff = new StringBuffer(String.valueOf(itr)).reverse();
			arrayList.add(Integer.parseInt(String.valueOf(sBuff)));
		}
		Collections.sort(arrayList);
		for(int i = 0; i < arr.length; i++) arr[i] = arrayList.get(i).intValue();
		
		return arr;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt(), arr[] = new int[5];
		
		System.out.println("Enter " + n + " values in the array: ");
		for(int i = 0; i<arr.length; i++) arr[i]= sc.nextInt();
		
		arr = getSorted(arr);
		System.out.println("After reversing the digits and sorting the array: ");
		for(int i : arr) System.out.println(i);
	}

	
}
