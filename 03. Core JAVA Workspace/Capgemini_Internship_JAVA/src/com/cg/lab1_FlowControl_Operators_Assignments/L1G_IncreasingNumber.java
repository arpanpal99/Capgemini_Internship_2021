package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;

public class L1G_IncreasingNumber {

	static boolean checkNumberInc(int number) {
		int temp = number, rem = 10;
		for (int i = 0; i < number; i++) {
			if (rem < temp % 10)
				return false;
			rem = temp % 10;
			temp /= 10;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (checkNumberInc(n))
			System.out.println(n + " is an Increasing Number");
		else
			System.out.println(n + " is not an Increasing Number");
		sc.close();
	}

}
