package com.capgemini.assignment.Day02;

public class HappyNumber {

	public static void main(String[] args) {
		int cnt = 1;
		System.out.println("First 10 Happy numbers are as follows: \n");
		for (int i = 1; cnt <= 10; i++) {
			int temp = i;
			while (temp != 1 && temp != 4) {
				int unit = 0, sum = 0;
				while (temp > 0) {
					unit = temp % 10;
					sum += unit * unit;
					temp /= 10;
				}
				temp = sum;
			}
			if (temp == 1) {
				System.out.print(i + " ");
				cnt++;
			}
		}
	}
}