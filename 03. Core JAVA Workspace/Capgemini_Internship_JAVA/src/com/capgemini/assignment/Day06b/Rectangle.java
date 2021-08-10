package com.capgemini.assignment.Day06b;

import java.util.Scanner;

public class Rectangle extends Shape {
	public double width;
	public double length;

//    Getters
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

//    Setters
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

//    Methods
	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

//    toString
	public String toString() {
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		System.out.print("Enter the color which you want to fill: ");
		s.color = sc.nextLine();
		if (s.color != null)
			s.filled = true;
		sc.close();
		return "Rectangle[ " + s + ", width= " + getWidth() + ", length= " + getLength() + " ]";
	}
}
