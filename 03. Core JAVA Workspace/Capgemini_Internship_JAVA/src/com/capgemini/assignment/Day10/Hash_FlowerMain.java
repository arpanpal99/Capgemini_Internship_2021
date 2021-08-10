package com.capgemini.assignment.Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_FlowerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1. Add elements to the Flower HashSet	\n"
						+ "2. Remove a Flower sample with zero quantity \n"
						+ "3. Display all the items in Flower HashSet\n"
						+ "4. Press any other key to exit\nEnter your choice: ");
		int choice = sc.nextInt();
		HashSet<Hash_Flower> flwrList = new HashSet<Hash_Flower>();
		
		while (choice == 1 || choice == 2 || choice == 3) {
			switch (choice) {

			case 1:
				System.out.print("Enter how many samples: ");
				int num = sc.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("-------------------------------------------");
					System.out.println("Enter the details of Flower Sample no. " + (i+1));
					System.out.print("Enter the Flower Sample id\t\t: ");
					int id = sc.nextInt();
					System.out.print("Enter the Flower Sample Name\t\t: ");
					String name = sc.next();
					System.out.print("Enter the price of the sample per KG\t: ");
					double pKG = sc.nextDouble();
					System.out.print("Enter the quantity of Sample in KGs\t: ");
					double qtyKG = sc.nextDouble();
					flwrList.add(new Hash_Flower(id, name, pKG, qtyKG));
				}
				break;
			case 2: 
				Iterator<Hash_Flower> flwrItr = flwrList.iterator();
				System.out.println("Removing flowers with zero quantity... ");
				while (flwrItr.hasNext()) {
					Hash_Flower fw = flwrItr.next();
					if (fw.getQtyKG() == 0) {
						System.out.println("Flower ID " + fw.getfID() + " has been removed.");
						flwrItr.remove();
					}
				}
				break;
			case 3: 
				flwrItr = flwrList.iterator();
				System.out.println("Flower HashSet values using Iterator: ");
				System.out.println("------------------------------------------------");
				while (flwrItr.hasNext()) {
					Hash_Flower fw = flwrItr.next();
					System.out.println("Flower Sample '" + fw.getfName() + "' has ID: " + fw.getfID() + 
										". \nPrice per KG of this sample = Rs." + fw.getPricePerKG() + 
										". \nTotal quantity of sample available = " + fw.getQtyKG() + " Kgs.");
					System.out.println("--------------");
				}
				break;
			case 4:
				System.out.println("*********");
				System.out.println("Farewell!");
				break;
			default:
				System.out.println("Wrong choice!");
			}
			System.out.println("***********************************************");
			System.out.print("1. Add elements to the Flower HashSet	\n"
							+ "2. Remove a Flower sample with zero quantity\n"
							+ "3. Display all the items in Product List\n"
							+ "4. Press 4 to exit\nEnter your choice: ");
			choice = sc.nextInt();
		}
		sc.close();
	}
}
