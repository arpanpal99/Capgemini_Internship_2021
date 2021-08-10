package com.selfLearning.ArrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		int simple_array[] = { 2, 5, 6, 3, 7 };
		for (Integer x : simple_array) // Advanced for loop
			System.out.print(x + " ");
		System.out.println("\n");

		ArrayList<Integer> myList = new ArrayList<Integer>(5);

		myList.add(32);
		myList.add(84);
		myList.add(67);
		myList.add(35);
		myList.add(49);

		for (Integer x : myList) // Advanced for loop
			System.out.print(x + " ");
		System.out.println("\nSize of the ArrayList = " + myList.size() + "\n");
		// Doesn't print the initially declared size of the array, but the current size
		// of the array

		myList.remove(2);
		System.out.println("Updated ArrayList after myList.remove(2):");
		for (Integer x : myList)
			System.out.print(x + " ");
		System.out.println("\nSize of the ArrayList = " + myList.size() + "\n");

		myList.set(2, 250);
		System.out.println("Updated ArrayList after myList.set(2, 250):");
		for (Integer x : myList)
			System.out.print(x + " ");
		System.out.println("\nSize of the ArrayList = " + myList.size() + "\n");

		myList.clear();
		for (Integer x : myList)
			System.out.print(x + " ");
		System.out.print("\nAfter myList.clear(), \nSize of the ArrayList = " + myList.size());

		System.out.println(myList); // To print the ArrayList

	}
}
