package com.capgemini.practice.Day12.Iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
		names.add("Hero");
		names.add("Hero2");
		names.add("Hero3");
		names.add("Hero4");
		names.add("Hero5");
		try {
			System.out.println("Names in the arrayList: ");
			Iterator<String> itr = names.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("Adding an element in between iteration");
				names.add("Hiralal");
			}
		} catch (Exception e) { 
			System.out.println(e); 
		} finally { 
			System.out.println("Finally block"); 
		}
	}
}