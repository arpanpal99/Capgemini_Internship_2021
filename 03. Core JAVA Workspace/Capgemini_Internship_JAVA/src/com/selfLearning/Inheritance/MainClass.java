package com.selfLearning.Inheritance;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();

		System.out.println("Enter length and breadth of the rectangle:");
		int length = sc.nextInt();
		rec.setHeight(length);
		int breadth = sc.nextInt();
		rec.setWidth(breadth);
		rec.set_values(length, breadth);

		System.out.println("Enter height and width of the triangle:");
		int height = sc.nextInt();
		tri.setHeight(height);
		int width = sc.nextInt();
		tri.setWidth(width);
		tri.set_values(height, width);

		System.out.println("Using getters and setters:");
		System.out.println("Area of the rectangle = " + rec.getAreaGS());
		System.out.println("Area of the triangle = " + tri.getAreaGS());

		System.out.println("\nWithout using getters and setters:");
		System.out.println("Area of the rectangle = " + rec.getArea());
		System.out.println("Area of the triangle = " + tri.getArea());

		System.out.println("\nSame values obviously :)");
		sc.close();
	}

}
