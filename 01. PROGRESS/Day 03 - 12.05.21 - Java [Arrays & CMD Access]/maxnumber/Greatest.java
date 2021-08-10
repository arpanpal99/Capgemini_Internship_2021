package maxnumber;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a - ");
		float a = sc.nextFloat();
		System.out.println("Enter the value of b - ");
		float b = sc.nextFloat();
		System.out.println("Value = " + (((a > b) ? (a-b) : (b-a))));
		sc.close();
	}

}