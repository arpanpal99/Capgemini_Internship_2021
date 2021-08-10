package com.capgemini.assignment.Day06b;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Press\n1. Get parameters for Circle:\n2. Get parameters for Rectangle\n3. Get parameters for Square\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			CircleData();
			break;
		case 2:
			RectangleData();
			break;
		case 3:
			SquareData();
			break;
		default:
			System.out.println("Wrong choice entered!");
		}
	}

	private static void CircleData() {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		System.out.print("Enter the radius of the circle: ");
		c.radius = sc.nextDouble();
		System.out.print(c);
		System.out.printf("\nArea of the circle: %.3f square units", c.getArea());
		System.out.printf("\nPerimeter of the circle: %.3f units", c.getPerimeter());

		sc.close();
	}

	private static void RectangleData() {
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.print("Enter the length of the rectangle: ");
		r.length = sc.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		r.width = sc.nextDouble();

		System.out.print(r);
		System.out.printf("\nArea of the rectangle is: %.2f square units", r.getArea());
		System.out.printf("\nPerimeter of the rectangle is: %.2f units", r.getPerimeter());

		sc.close();
	}

	private static void SquareData() {
		Scanner sc = new Scanner(System.in);
		Square s = new Square();

		System.out.print("Enter the side of the square: ");
		s.length = sc.nextDouble();

		System.out.print(s);
		System.out.printf("\nArea of the square: %.2f square units", s.getArea());
		System.out.printf("\nPerimeter of the square: %.2f units", s.getPerimeter());
		sc.close();
	}
}
