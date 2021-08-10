package com.capgemini.practice.Day07.InnerClass;

public class InnerClassDemo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object for non static inner class
		//first create object for outer class
		//OuterClass outCls = new OuterClass();
		//using the outer class object create an object for Inner Class
		//OuterClass.InnerClass innCls = outCls.new InnerClass();
	
		
		//creating an object for static inner class
		InnerClassDemo_OuterClass.InnerClass innCls = 
				new InnerClassDemo_OuterClass.InnerClass();
		//calling innerclass method
		innCls.printValue();

	}

}
