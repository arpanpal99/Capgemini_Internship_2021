package com.capgemini.assignment.Day02;

public class LucasNumber {

	public static void main(String args[]) {
		int a = 2, b = 1, c = 3, temp;
		System.out.println("First 10 numbers of the Lucas Sequence - ");
		System.out.println(b);
		System.out.println(a);
		while (c++ <= 10) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}
	}
}
