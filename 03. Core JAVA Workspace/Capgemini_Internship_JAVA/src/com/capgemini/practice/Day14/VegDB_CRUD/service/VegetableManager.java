package com.capgemini.practice.Day14.VegDB_CRUD.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.practice.Day14.VegDB_CRUD.model.Vegetable;

public class VegetableManager {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vegetable> vegList = new ArrayList<Vegetable>();
	static Iterator<Vegetable> vegItr;
	public static void invokeCRUD() {
		
		int choice = 1;
		while(choice != 0) {
			
			System.out.println("**************************************************");
			System.out.print("1. CREATE\n2. READ\n3. UPDATE\n4. DELETE\n5. SORT\n6. SORT by ID\n7. SORT by Name\n8. SORT by Price\n0. EXIT\nEnter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:		Create(); break;
			case 2:		Read(); break;
			case 3:		Update(); break;
			case 4:		Delete(); break;
			case 5:		SortUsingComparable(); break;
			case 6:		sortUsingVegID(); break;
			case 7:		sortUsingVegName(); break;
			case 8:		sortUsingVegPrice(); break;
			case 0:		System.out.println("**************************************************\nExiting..."); break;
			default:	System.out.println("Wrong Choice..!"); break;
			
			}
			
		}
		
	}
	private static void Create() {

		System.out.println("---------------------------");
		System.out.println("Creating a vegetable object");
		System.out.println("---------------------------");
//		System.out.print("Enter vegetable ID: "); int id = sc.nextInt(); 
//		System.out.print("Enter vegetable Name: "); String name = sc.next();
//		System.out.print("Enter vegetable Price: "); float price = sc.nextFloat();
//		vegList.add(new Vegetable(id, name, price));
		vegList.add(new Vegetable(1005, "fbc", 652));
		vegList.add(new Vegetable(1002, "dcd", 541));
		vegList.add(new Vegetable(1003, "edf", 985));
		vegList.add(new Vegetable(1009, "gth", 145));
		System.out.println("4 vegetable objects have been created automatically "
							+ "\nand added to the List");
		
	}
	private static void Read() {
		
		System.out.println("--------------------------");
		System.out.println("Vegetable Database:");
		System.out.println("--------------------------");
		vegItr = vegList.iterator();
		while(vegItr.hasNext()) {
			Vegetable v = vegItr.next();
			System.out.println("Vegetable ID\t: " + v.getVegID());
			System.out.println("Vegetable name\t: " + v.getVegName());
			System.out.println("Vegetable price\t: " + v.getVegPrice());
			System.out.println("--------------------------------");
		}
		
	}
	private static void Update() {
		
		System.out.print("Enter a vegetable ID to update it's details: "); int id = sc.nextInt();
		vegItr = vegList.iterator();
		while(vegItr.hasNext()) {
			Vegetable v = vegItr.next();
			if(v.getVegID() == id) {
				System.out.print("Enter vegetable Name: "); v.setVegName(sc.next());
				System.out.print("Enter vegetable Price: "); v.setVegPrice(sc.nextFloat());
				System.out.println("Vegetable with ID: " + id + " has been modified...");
				break;
			}
		}
	}
	private static void Delete() {
		
		System.out.print("Enter a vegetable ID to delete it's details: "); int id = sc.nextInt();
		vegItr = vegList.iterator();
		while(vegItr.hasNext()) {
			Vegetable v = vegItr.next();
			if(v.getVegID() == id) {
				vegItr.remove();
				System.out.println("Vegetable with ID: " + id + " has been deleted...");
				break;
			}
		}
	}
	private static void SortUsingComparable() {
		Collections.sort(vegList);
		System.out.println("--------------------------");
		System.out.println("Vegetable ArrayList Sorted");
		System.out.println("--------------------------");
	}
	
	private static void sortUsingVegID() {
		
		Collections.sort(vegList, new VegIDComparator());
		System.out.println("--------------------------------");
		System.out.println("ArrayList Sorted according to ID");
		System.out.println("--------------------------------");
	}
	private static void sortUsingVegName() {
		
		Collections.sort(vegList, new VegNameComparator());
		System.out.println("----------------------------------");
		System.out.println("ArrayList Sorted according to Name");
		System.out.println("----------------------------------");
	}
	private static void sortUsingVegPrice() {
		
		Collections.sort(vegList, new VegPriceComparator());
		System.out.println("-----------------------------------");
		System.out.println("ArrayList Sorted according to Price");
		System.out.println("-----------------------------------");
	}
}
