package com.capgemini.practice.Day03;

import java.util.Scanner;

public class Area_Perimeter_Circle {
	private static final double Pi = 3.14;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle - ");
		double radius = sc.nextDouble();
		System.out.println("Area of the circle = " + Pi * radius * radius);
		sc.close();
	}

}
