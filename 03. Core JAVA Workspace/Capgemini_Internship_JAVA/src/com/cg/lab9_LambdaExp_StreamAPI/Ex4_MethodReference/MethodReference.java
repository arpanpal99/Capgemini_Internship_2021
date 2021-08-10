package com.cg.lab9_LambdaExp_StreamAPI.Ex4_MethodReference;

import java.util.Scanner;

@FunctionalInterface
interface Display {
	void print();
}

public class MethodReference {

	private int id;
	private String name;
	private float marks1;
	private float marks2;
	private float marks3;

	public MethodReference(int id, String name, float marks1, float marks2, float marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}

	public float calculateTotal() {
		return getMarks1() + getMarks2() + getMarks3();
	}

	// method to display details
	public void display() {
		System.out.println("\nDetails are :");
		System.out.println("ID : " + getId());
		System.out.println("Name : " + getName().toUpperCase());
		System.out.println("Total : " + calculateTotal());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm = new Scanner(System.in); // Scanner object creation by Shrijit Majumder
		int id;
		do {
			System.out.print("Enter the ID : ");
			id = sm.nextInt();
			if (id <= 0)
				System.out.println("ID cannot be zero or negative.");
		} while (id <= 0);
		String name;
		boolean result = false;
		do {
			System.out.print("Enter the name : ");
			name = sm.next();
			result = name.matches("^[a-zA-Z]+$");
			if (result == false)
				System.out.println("Name must only consist of alphabets.");
		} while (result == false);
		float phy_marks, chem_marks, math_marks;
		do {
			System.out.print("Enter marks for Physics (out of 100) : ");
			phy_marks = sm.nextFloat();
			if (phy_marks < 0 || phy_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (phy_marks < 0 || phy_marks > 100);
		do {
			System.out.print("Enter marks for Chemistry (out of 100) : ");
			chem_marks = sm.nextFloat();
			if (chem_marks < 0 || chem_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (chem_marks < 0 || chem_marks > 100);
		do {
			System.out.print("Enter marks for Maths (out of 100) : ");
			math_marks = sm.nextFloat();
			if (math_marks < 0 || math_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (math_marks < 0 || math_marks > 100);
		MethodReference stdm = new MethodReference(id, name, phy_marks, chem_marks, math_marks);
		Display display = stdm::display;

		display.print();

		sm.close();
	}

}