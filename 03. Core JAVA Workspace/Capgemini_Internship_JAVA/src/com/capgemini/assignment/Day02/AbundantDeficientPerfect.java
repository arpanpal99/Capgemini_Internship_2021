package com.capgemini.assignment.Day02;

public class AbundantDeficientPerfect {

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			if (i == 1) {
				System.out.println("1 is neither perfect, abundant or deficient number");
				continue;
			}
			int num = i;
			int sum = 0;
			for (int j = 1; j <= (num / 2); j++) {
				if (num % j == 0)
					sum += j;
			}
			if (sum == num)
				System.out.println(i + " is a Perfect number");
			if (sum < num)
				System.out.println(i + " is a Deficient number");
			if (sum > num)
				System.out.println(i + " is an Abundant number");
		}
	}
}
