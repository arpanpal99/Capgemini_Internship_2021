package com.capgemini.assignment.Day02;

public class Kaprekar {

	public static void main(String[] args) {

		int count = 0; // To find how many Kaprekar Numbers are there

		for (int n = 1; n <= 1000; n++) {
			String myStr = Integer.toString(n * n); // Conversion to string so as to print "001" as it is instead of "1"
			int iterator = myStr.length() / 2 + 1; // Iterate upto half of the squared number
			String[] partition = new String[2]; // For dividing the String 'myStr' into two parts

			for (int j = 0; j < iterator; j++) {
				partition[0] = myStr.substring(0, j); // First part of the sqaured number
				if (partition[0].equals(""))
					partition[0] = "0"; // When j becomes 0, then substring method returns Null String;
										// therefore we need to set first partition as 0
										// else it will give an error in String to Integer conversion later
				partition[1] = myStr.substring(j); // Second part of the squared number

				int first = Integer.parseInt(partition[0]); // String to Integer
				int second = Integer.parseInt(partition[1]); // String to Integer
				if (first + second == n) {
					System.out.println(n + "\t" + myStr + "\t  " + partition[0] + " + " + partition[1]);
					count++;
					break;
				}
			}
		}
		System.out.println("\nTotal there are " + count + " Kaprekar numbers");
	}
}