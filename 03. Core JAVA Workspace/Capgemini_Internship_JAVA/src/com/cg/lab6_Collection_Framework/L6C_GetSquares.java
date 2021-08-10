package com.cg.lab6_Collection_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L6C_GetSquares {

	private void getSquares(int[] arr) {
		
		HashMap<Integer,Integer>hmap = new HashMap<Integer,Integer>();
		
		for(int itr : arr) hmap.put(itr, itr*itr);
		
		for(Map.Entry<Integer, Integer> e : hmap.entrySet())
			System.out.println(e.getKey() + " \t- " + e.getValue());
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: "); int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements in the array: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	
		new L6C_GetSquares().getSquares(arr);
		sc.close();
	}

	
}
