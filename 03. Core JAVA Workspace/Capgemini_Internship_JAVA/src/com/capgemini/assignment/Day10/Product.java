package com.capgemini.assignment.Day10;

import java.util.Scanner;

public class Product {

	private int pID;
	private String pName;
	private double pPrice;
	
	//***************** Constructors *********************************
	public Product() {
		super();
	}
	public Product(int pID, String pName, double pPrice) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	//****************** Getters & Setters ***************************
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	public void displayProductDetails() {
		System.out.println("--------------------------------");
		System.out.println("Product Id\t: " + pID);
		System.out.println("Product Name\t: " + pName);
		System.out.println("Product Price\t: " + pPrice);
	}
	public void displayProductDetails(Product pr) {
		System.out.println("--------------------------------");
		System.out.println("Product Id\t: " + pr.getpID());
		System.out.println("Product Name\t: " + pr.getpName());
		System.out.println("Product Price\t: " + pr.getpPrice());
	}
	public void displayProductDetails(Product[] prList) {
		System.out.println("--------------------------------");
		for(int i = 0; i < prList.length; i++) {
			if(prList[i] != null) {
			System.out.println("Product Id\t: " + prList[i].getpID());
			System.out.println("Product Name\t: " + prList[i].getpName());
			System.out.println("Product Price\t: " + prList[i].getpPrice());
			System.out.println("--------------");
			}
		}
	}
	
	public void displayProductById(Product[] prList, int ID) {
		for (int i = 0; i < prList.length; i++) {
			if (prList[i].getpID() == ID) {
				System.out.println("employee found at " + i);
				System.out.println("Product Id = " + prList[i].getpID() + "Product name = " + prList[i].getpName() + "Product Price = " + prList[i].getpPrice());
				break;
			} else 
				System.out.println("No such product found");
		}
		System.out.println();
	}
	
	Scanner sc = new Scanner(System.in);
	Product[] productList = new Product[3];

	public Product[] createProductList() {
		System.out.println("------------------------------------");
		System.out.println("Enter the ID, then Name and finally Price");
		for (int i = 0; i < productList.length; i++) {
			System.out.println("Enter the product details for product no. " + (i+1));
			productList[i] = new Product();
			productList[i].setpID(sc.nextInt());
			productList[i].setpName(sc.next());
			productList[i].setpPrice(sc.nextDouble());
		}
		return productList;
	}
	public void updateProductById(Product[] pr, int ID) {
		for (int i = 0; i < pr.length; i++) {
			if (pr[i].getpID() == ID) {
				System.out.println("Product found at " + i);
				System.out.println("Enter new name to update for the product");
				String updatedName = sc.next();
				pr[i].setpName(updatedName);
				System.out.println("Product Id = " + pr[i].getpID() + "\nProduct name = " + pr[i].getpName() + "\nProduct Price = " + pr[i].getpPrice());
				break;
			} else 
				System.out.println("No such product found");
		}
		System.out.println();
	}
	public Product[] deleteProductById(Product[] pr, int ID) {
		int originalLength = pr.length;
		for (int i = 0; i < originalLength; i++) {
			if (pr[i].getpID() == ID) {
				System.out.println("Product found at " + i);
				//for(int j = i; i < originalLength-1; i++)
				pr[i] = null;
				originalLength--;
				break;
			} else {
				System.out.println("No such roduct found");
			}
		}
		System.out.println();
		return pr;
	}
}


















