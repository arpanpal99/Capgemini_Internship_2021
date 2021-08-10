package com.capgemini.assignment.Day05;

import java.util.*;

public class D5H_RemoveOneChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine(), ans = "";
		;
		System.out.println("Enter a character you need to remove: ");
		char c = sc.next().charAt(0);

		char[] ch = s.toCharArray();
		for (char x : ch)
			if (x != c)
				ans += x;
		System.out.println("Final String: \n" + ans);
		sc.close();
	}

}