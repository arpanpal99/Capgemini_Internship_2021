package com.cg.lab9_LambdaExp_StreamAPI.Ex5_CalcFactorial;

public class CalcFactorial {
	
	
	public static int calculateFact(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) result *= i;
		return result;
	}

	public static void main(String[] args) {

		Factorial fac = CalcFactorial::calculateFact;
		
		System.out.println(fac.test(5));
		
	}

}