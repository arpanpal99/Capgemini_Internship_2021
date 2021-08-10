package com.capgemini.practice.Day07.Constructors;

public class Constructor_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Student();
		//Student s = new Student(); //default constructor
		//Student s1 = new Student(1,"rama",85);//parameterized constructor
		//s.printStudentValues();
		Constructor_ExamDept ed = new Constructor_ExamDept();
		ed.printStudentValues();
		ed.checkExamFeePayment();
		//static methods or variables are accessed using class name
		Constructor_Student.sayHi();
		System.out.println(Constructor_Student.collegeName);
	}

}
