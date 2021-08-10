package com.capgemini.practice.Day03;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0)
				System.out.println("0");
			continue;
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0)
				break;
		}
		sc.close();
	}

}
