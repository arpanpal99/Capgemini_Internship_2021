package com.capgemini.practice.Day05;
import java.util.Scanner;
import static java.lang.System.*;
public class MathClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		out.println("Enter the number");;
		int num = sc.nextInt();
		out.println("cube root = " + Math.cbrt(num));
		out.println("square root = " +Math.sqrt(num));
		out.println("PI value = " +Math.PI);
	   out.println("absolute value of a number = " +Math.abs(num));
		out.println("enter the float number");
		float num1= sc.nextFloat();
		System.out.println("floor value = "+Math.floor(num1));
		System.out.println("floor value = "+Math.ceil(num1));
		System.out.println("Cos 90 value = " +Math.cos(90));
		System.out.println("Sin 0 value = " +Math.sin(0));
		
		System.out.println(Math.random());
	}

}
