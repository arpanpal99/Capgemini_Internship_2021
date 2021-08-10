package com.capgemini.practice.Day07.InnerClass;

//Non Static Inner class or Nested class
public  class InnerClassDemo_OuterClass {
	private static int a = 30;
	
	static void displayMessage() {
		System.out.println("In outer class private method");
	}
	
	static class InnerClass {

		void printValue() {
			System.out.println("value of a = " + a);
			displayMessage();
		}
		
	static void displayMessage() {
			System.out.println("In inner class private method");
		}

	}

}
