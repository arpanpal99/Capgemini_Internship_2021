package com.capgemini.practice.Day03;

import java.util.Scanner;

public class Area_Perimeter_Rect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of a rectangle - ");
		float length = sc.nextFloat();
		System.out.println("Enter breadth of the rectangle - ");
		float breadth = sc.nextFloat();
		System.out.println("Area of the rectangle = " + (length * breadth));
		System.out.println("Perimeter of the rectangle = " + 2 * (length + breadth));
		sc.close();
	}

}
