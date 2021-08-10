package com.selfLearning.Polymorphism;

public class MainClass {

	public static void main(String[] args) {

		// ------------------------------------------------------------------------------------------------------------------------------------------------------

		MyBank abc = new Bank_ABC(); // "abc" is an object handle of MyBank class which points to the Bank_ABC class
		MyBank def = new Bank_DEF(); // This is possible only because MyBank is a super class to Bank_ABC (called
										// Inheritance)
		MyBank ghi = new Bank_GHI(); // "abc", "def", "ghi" are all object handles of the Super Class MyBank and they
										// point to different classes in the package.
										// This property is called Polymorphism

		// ------------------------------------------------------------------------------------------------------------------------------------------------------

		// MyBank par = new MyBank(); // Since MyBank is an abstract class, we can't
		// create an instance of this class.
		// Hence, an ABSTRACT CLASS CAN'T BE INSTANTIATED
		// Rather, we can make an object handle or reference (like "abc") of this class
		// that can point to other non-abstract class
		// A non-abstract class is called CONCRETE Class.
		Bank_DEF mys = new Bank_DEF(); // No explanation for this :)

		// ------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Interest rate of Bank ABC = " + abc.getInterest());
		System.out.println("Interest rate of Bank DEF = " + def.getInterest());
		System.out.println("Interest rate of Bank GHI = " + ghi.getInterest());
		System.out.println("Interest rate of Bank MYS = " + mys.getInterest());
		// System.out.println("Interest rate of the virtual entity Bank = " +
		// par.getInterest());
		// There can't be any object or instance of the ABSTRACT CLASS "MyBank"

		// "getInterest()" method has the same name across all 4 different classes
		// This "getInterest()" method also has the same return type and same number of
		// passing arguments (0 in this case)
		// But only the method definition is different
		// This property is called "Method Overriding"

		// Method Overloading is implemented within the same class
		// For Method Overloading only the method name is required to be same
		// The return type and the number of argument passing can vary
	}

}
