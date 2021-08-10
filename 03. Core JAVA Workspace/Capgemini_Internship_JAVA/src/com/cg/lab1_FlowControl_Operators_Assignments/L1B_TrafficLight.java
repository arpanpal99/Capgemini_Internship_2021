package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;

public class L1B_TrafficLight {

	public static void main(String[] args) {
		System.out.println("Red: 1\nYellow: 2\nGreen: 3\nEnter your choice among 1, 2 or 3: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		}
		sc.close();
	}

}
