package com.capgemini.practice.Day12.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("ab");
		names.add("abc");
		names.add("abcd");
		names.add("abcde");
		names.add("abcdef");
		
		try {
			System.out.println("Names in the List:");
			Iterator<String> itr = names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("Let's add another name in the list");
				names.add("abcdefg");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally terminated successfully");
			// Using 
			
			CopyOnWriteArrayList<String> namesList = new CopyOnWriteArrayList<String>();
			namesList.add("ab");
			namesList.add("abc");
			namesList.add("abcd");
			namesList.add("abcde");
			namesList.add("abcdef");
			
			try {
				System.out.println("Names in the List:");
				Iterator<String> itr = namesList.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					//System.out.println("Let's add another name in the list");
					namesList.add("REPEATED_abcdefg");
				}
				itr = namesList.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					//System.out.println("Let's add another name in the list");
					namesList.add("abcdefg");
				}
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			finally {
				System.out.println("Program terminated successfully");
			}
		}
		
		
	}

}
