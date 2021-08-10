package com.capgemini.assignment.Day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class HashMap_ShoppingList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 1, num = 0, ValueSet;
		String KeySet;
		HashMap<String, Integer> ShoppingList = new HashMap<String, Integer>();
		Set<String> ShoppingKeySet = ShoppingList.keySet();
		Collection<Integer> ShoppingValueSet = ShoppingList.values();
		Set<Entry<String, Integer>> ShoppingListEntrySet = ShoppingList.entrySet();
		Map<String, Integer> ShoppingListSorted;

		while(choice != 7) {
			System.out.println("\n\n****************************************************");
			System.out.println("****************************************************");
			System.out.print("1. Enter keys & values into the Shopping List HashMap\n"
					       + "2. Display the Shopping List keyset\n"
						   + "3. Display the Shopping List values\n"
						   + "4. Display the Shopping List entryset\n"
						   + "5. Update an entry field by providing it's key\n"
						   + "6. Sort the Shopping List\n"
						   + "7. Press 7 to EXIT\n"
						   + "----------------------------------------------\n"
						   + "ENTER YOUR CHOICE: ");
			choice = sc.nextInt();
			switch(choice) {
			
					// INPUT
			case 1: System.out.println("***** Input values into Shopping List Keys HashMap *****");
					System.out.println("--------------------------------------------------------");
			 		System.out.print("Enter how many entries you want to input: ");	num = sc.nextInt();
			 		for(int i = 1; i <= num; i++) {
			 			System.out.print(i + ".a. Enter key  (String) : "); 	 KeySet = sc.next();
			 			System.out.print("  b. Enter value(Integer): "); ValueSet = sc.nextInt();
			 			ShoppingList.put(KeySet, ValueSet);
			 		}
			 		break;
			
			 		
			case 2: // KEYS
					System.out.println("***** Displaying Shopping List Keys ******");
			 		System.out.println(ShoppingKeySet);
			 		break;
			 		
			 		
			case 3: // VALUES
					System.out.println("***** Displaying Shopping List Values ******");
			 		System.out.println(ShoppingValueSet);
			 		break;
			 		
			 		
			case 4: // KEY VALUE PAIRS
					System.out.println("***** Displaying Shopping List Key-Value Pairs ******");
			 		System.out.println(ShoppingListEntrySet);
			 		break;
			 		
			 		
			case 5:	// UPDATE or REPLACE
					System.out.println("***** Updating Shopping List Key-Value Pairs ******");
					System.out.print("Search for an existing key in Shopping List: "); KeySet = sc.next();
					int flag = 0;
					for(String key : ShoppingKeySet) {
						if(key.equals(KeySet)) {
							System.out.println("Key found in the HashMap. \nEarlier value: " + ShoppingList.get(KeySet));
							System.out.print("Enter new integer value: "); ValueSet = sc.nextInt();
							ShoppingList.replace(KeySet, ValueSet);
							flag = 1;
							break;
						}
					}
					if(flag == 0) System.out.println("Key not found! Try again...");
					break;
					
					
			case 6: // SORT HashMap using TreeMap
					System.out.println("***** Sort the Shopping List HashMap using TreeMap *****");
					ShoppingListSorted = new TreeMap<String, Integer>();
					ShoppingListSorted.putAll(ShoppingList);
					System.out.println("Shopping List after sorting: \n" + ShoppingListSorted);
					break;
					
					
			case 7: // EXIT condition
					System.out.println("***** Exiting from the Shopping List *****");
			 		System.out.println("Farewell..!");
			 		break;
			 		
			
			default: System.out.println("***** Wrong Choice *****");
			 		 System.out.println("Try again...");
			 		 System.out.println("------------------------");
			 		 break;
			}
		}
		
	}
	
}
