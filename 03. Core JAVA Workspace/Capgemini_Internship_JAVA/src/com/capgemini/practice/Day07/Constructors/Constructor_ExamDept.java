package com.capgemini.practice.Day07.Constructors;

public class Constructor_ExamDept extends Constructor_Student{
	
	public Constructor_ExamDept(){
		super(128,"Sri",97); //this calls super class param constructor
		System.out.println("In ExaminationDepartment default constructor");
	}
	
	public void checkExamFeePayment() {
		System.out.println("Result from check exam fee payment method");
		super.marks = 56;//accessing super class instance variable using super keyword
		super.displayResult();//accessing super class instance method using super keyword
	}
	
}
