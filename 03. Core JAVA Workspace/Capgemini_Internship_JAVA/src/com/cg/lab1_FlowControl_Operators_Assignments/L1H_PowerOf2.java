package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;
import java.lang.Math;

public class L1H_PowerOf2 {

	static boolean checkNumberPow(int n) {
		for (int i = 0; i < 30; i++)
			if (n == Math.pow(2, i))
				return true;
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number below: ");
		int n = sc.nextInt();
		if (checkNumberPow(n))
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is no power of 2");
		sc.close();
	}

}
