package com.capgemini.practice.Day05;
import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer();
		String str ;
		System.out.println("enter the sentence");
		str = sc.nextLine();
		System.out.println("String value = " + str);
		//convert the string in to string buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String Buffer value = " + sb);
		System.out.println("hashcode of String Buffer Object = "+sb.hashCode());
		sb.append("in java string buffer is modifiable string");
		System.out.println("String Buffer value  after append= " + sb);
		System.out.println("hashcode of String Buffer Object  after append= "+sb.hashCode());
		System.out.println("after modifying converting the stringbuffer  in to string = " + sb.toString());
		System.out.println("check whether sb is instance of String or not = " + sb instanceof String);
	}

}
