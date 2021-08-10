package com.selfLearning.Encapsulation;

public class MyClass {

	public static void main(String[] args) {

		// -------------------------------------------------------------------------------------------------------
		Student Mark = new Student(); // Mark -> Object or Instance
		Student Tom = new Student(); // Tom -> Object or Instance
		Student Alice = new Student(); // Alice -> Object or Instance
		// ---------------------------------------
		Mark.setName("Mark Johnson");
		Mark.setAge(22);
		Mark.setId(1001);
		/*
		 * System.out.println(Mark.getName()); System.out.println(Mark.getId());
		 * System.out.println(Mark.getAge());
		 */
		// ----------------------------------------
		Tom.setName("Tommy Vercetti");
		Tom.setAge(21);
		Tom.setId(1002);
		/*
		 * System.out.println(Tom.getName()); System.out.println(Tom.getId());
		 * System.out.println(Tom.getAge());
		 */
		// -----------------------------------------
		Alice.setName("Alice Portman");
		// -----------------------------------------

		Tom.getDetails(); // "getDetails()" is a NON STATIC function so it can be called using an OBJECT.
		Mark.getDetails();
		Alice.getDetails(); // Object Alice takes the default ID and AGE as these are not declared.
							// Default values are taken from the Student Class Constructor.

		Student.getDetailsStatic();
		// "getDetailsStatic()" should be called using the CLASS NAME because this
		// method is STATIC.
		// "getDetailsStatic()" can also be called using any instance of the Student
		// class, but it's not preferred.

		// Mark.getDetailsStatic();
		// This shows a warning that a static method is called in a NON-STATIC way.
		// -------------------------------------------------------------------------------------------------------

	}
}
