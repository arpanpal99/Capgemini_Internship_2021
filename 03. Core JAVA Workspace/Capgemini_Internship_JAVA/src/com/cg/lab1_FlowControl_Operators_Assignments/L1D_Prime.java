package com.cg.lab1_FlowControl_Operators_Assignments;

import java.util.Scanner;
import java.lang.Math;

public class L1D_Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, prime[] = new int[1000], cnt = 1;
		prime[0] = 2;
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for (i = 3; i <= n; i++) {
			int temp = 0;
			for (j = 0; prime[j] < Math.sqrt(i); j++)
				if (i % prime[j] == 0) {
					temp = 1;
					break;
				}
			if (temp == 0)
				prime[cnt++] = i;
		}
		System.out.println((cnt - 1) + " prime Numbers from 1 to " + n + " are: \n");
		for (i = 0; i < cnt; i++)
			System.out.println(prime[i]);
		sc.close();
	}
}
