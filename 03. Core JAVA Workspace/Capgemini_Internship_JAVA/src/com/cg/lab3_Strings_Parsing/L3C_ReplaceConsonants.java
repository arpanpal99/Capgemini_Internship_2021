package com.cg.lab3_Strings_Parsing;

import java.util.*;

public class L3C_ReplaceConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to modify:");
		String str = sc.nextLine();

		System.out.print("Altered String of '" + str + "' is: " + alterString(str));
		sc.close();
	}

	static String alterString(String str) {
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++)
			if (!((chArr[i] == 'a') || (chArr[i] == 'e') || (chArr[i] == 'i') || (chArr[i] == 'o')
					|| (chArr[i] == 'u')))
				chArr[i] = (char) ((int) chArr[i] + 1);
		;
		return String.valueOf(chArr);
	}
}
