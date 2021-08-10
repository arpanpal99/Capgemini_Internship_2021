package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;
import java.lang.Math;

public class L1A_DigitCube {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		int sum = 0, temp = num;
		while (temp > 0) {
			sum += Math.pow((temp % 10), 3);
			temp /= 10;
		}
		System.out.println("The sum of cubes of the digits of " + num + " is = \n" + sum);
		inp.close();
	}

}
