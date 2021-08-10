package com.capgemini.assignment.Day10;

import java.util.Scanner;

public class Product_MainClass {

	public static void main(String[] args) {
		
		Product pr = new Product();
		Product[] prList = new Product[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Create a Product List\n2. Update an existing Product List\n"
						+ "3. Delete an existing Product List\n4. Display all the items in Product List\n"
						+ "5. Display specific product by Product ID\n6. Press 6 to exit\n"
						+ "Enter your choice: ");
		int choice = sc.nextInt();
		while(choice != 6) {
			switch(choice) {
			
			case 1: prList = pr.createProductList(); break;
			case 2: System.out.print("Enter existing Product ID to update it's details: ");
					pr.updateProductById(prList, sc.nextInt());
					break;
			case 3: System.out.print("Enter existing Product ID to delete it's details: ");
					pr.deleteProductById(prList, sc.nextInt());
					break;
			case 4: System.out.println("The entire product Database is below:");
					pr.displayProductDetails(prList);
					break;
			case 5: System.out.print("Enter existing product ID to display it's details: ");
					pr.displayProductById(prList, sc.nextInt());
					break;
			case 6: System.out.println("*********");
					System.out.println("Farewell!");
					break;
			}
			System.out.println("***********************************************");
			System.out.print("1. Create a Product List\n2. Update an existing Product List\n"
					+ "3. Delete an existing Product List\n4. Display all the items in Product List\n"
					+ "5. Display specific product by Product ID\n6. Press 6 to exit\n"
					+ "Enter your choice: ");
			choice = sc.nextInt();
		}
	}

}
