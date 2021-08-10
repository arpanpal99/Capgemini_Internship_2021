package com.capgemini.practice.Day05;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is a string in java.string is used to store group of characters";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("."));
		}
	}

}
