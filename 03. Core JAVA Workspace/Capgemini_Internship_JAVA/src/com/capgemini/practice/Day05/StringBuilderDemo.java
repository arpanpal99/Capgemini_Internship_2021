package com.capgemini.practice.Day05;
import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer();
		String str ;
		System.out.println("enter the sentence");
		str = sc.nextLine();
		System.out.println("String value = " + str);
		//convert the string in to string buffer
		StringBuilder sb = new StringBuilder(str);
		System.out.println("StringBuilder value = " + sb);
		System.out.println("hashcode of StringBuilder Object = "+sb.hashCode());
		sb.append("in java StringBuilder is modifiable string");
		System.out.println("StringBuilder value  after append= " + sb);
		System.out.println("hashcode of StringBuilder Object  after append= "+sb.hashCode());
		sb.insert(6,"iiiiiiii" );
		System.out.println("StringBuilder Object  after insert= "+sb);
		System.out.println("hashcode of StringBuilder Object  after insert= "+sb.hashCode());
		//System.out.println("after modifying converting the StringBuilder in to string = " + sb.toString());
		System.out.println("remove some word from the StringBuilder = " + sb.delete(0, 4));
		String newStr =  sb.toString();
		System.out.println("check whether sb is instance of String or not = " +(newStr instanceof String));
	}

}
