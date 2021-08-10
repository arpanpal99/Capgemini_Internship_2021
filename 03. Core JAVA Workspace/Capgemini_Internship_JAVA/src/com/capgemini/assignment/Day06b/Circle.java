package com.capgemini.assignment.Day06b;

import java.util.Scanner;

public class Circle extends Shape {
	public double radius;

//    Getters
	public double getRadius() {
		return radius;
	}

//    Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}

//    Methods
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

//    toString
	public String toString() {
		Shape s = new Shape();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the color: ");
		s.color = sc.nextLine();
		if (s.color != null)
			s.filled = true;
		sc.close();
		return "Circle[ " + s + ", radius= " + getRadius() + " ]";
	}
}
