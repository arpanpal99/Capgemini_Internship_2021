package com.capgemini.practice.Day07.Constructors;

public class Constructor_Student {
	
	static {
		System.out.println("this is static block");
	}
	
	//variables or data members or instance variables
	private int stdId; //instance variable of current class
	private String stdName;
	public static float marks;
	public static String collegeName = "Techno group";
	
	//default constructor
	public  Constructor_Student(){
		this(126,"krishna",87);
		System.out.println("its a default constructor");
	}
	

	//parameterized constructor
	public Constructor_Student(int stdId,String stdName,float marks ) {
		//this();//this calls default constructor of the same class
		//Note : constructor call should be first statement;
		super();//Object is the super class 
		System.out.println("parameterized constructor");
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}
	
	public void printStudentValues() {
		System.out.println("Student values = ");
		System.out.println("Student Id = "+stdId);
		System.out.println("Student Name = "+stdName);
		System.out.println("Student Marks = "+marks);
		this.displayResult();
	}

	public static void displayResult() {
		if(marks > 75)
			System.out.println("Distinction");
		if((marks >= 60) && (marks < 75))
			System.out.println("First class");
		else
			System.out.println("pass");
	}
	
	public static void sayHi() {
		System.out.println("hi");
	}
	

}
