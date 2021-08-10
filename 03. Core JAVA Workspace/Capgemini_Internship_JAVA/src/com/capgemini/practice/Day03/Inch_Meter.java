package com.capgemini.practice.Day03;

import java.util.Scanner;

public class Inch_Meter {

	public static void main(String[] args) {
		System.out.println("Enter a value in inches - ");
		Scanner sc = new Scanner(System.in);
		double inch = sc.nextDouble();
		System.out.println("Equivalent value in Meteres = " + inch / 39.37);
		sc.close();
	}

}
