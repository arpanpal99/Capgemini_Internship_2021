package com.cg.lab9_LambdaExp_StreamAPI.Ex2_FormatString;

import java.util.Scanner;

public class formatString {
	
	   public static void main(String[] args) {
		   
		Space formattedStr = ()-> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.next();
			sc.close();
			return str.replace(""," ").trim();
		};
		
		System.out.println("Output string: "+ formattedStr.addSpace());
	}
}
