package com.capgemini.practice.Day03;

import java.util.Scanner;

public class Perfect_Sqaure_Root {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sq = sc.nextInt();
		int root = (int) (Math.sqrt(sq));
		if (root * root == sq)
			System.out.println("Perfect Square");
		else
			System.out.println("Not a Perfect Square");
		sc.close();
	}

}
