package com.capgemini.assignment.Day02;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), sum = 0, d, temp = num, fact;
		while (num > 0) {
			d = num % 10;
			fact = 1;
			for (int i = 1; i <= d; i++)
				fact *= i;
			sum += fact;
			num /= 10;
		}
		if (sum == temp)
			System.out.println("IT IS A STRONG NUMBER");
		else
			System.out.println("IT IS NOT A STRONG NUMBER");
		sc.close();
	}
}
