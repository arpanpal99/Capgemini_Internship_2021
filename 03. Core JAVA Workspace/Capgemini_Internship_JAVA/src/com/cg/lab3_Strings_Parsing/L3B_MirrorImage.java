package com.cg.lab3_Strings_Parsing;

import java.util.Scanner;

public class L3B_MirrorImage {

	static String getImage(String str) {
		return (new StringBuffer(str).reverse()).toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to get mirrored: ");
		String str = sc.next();
		System.out.println(str + "|" + getImage(str));
		sc.close();
	}

}
