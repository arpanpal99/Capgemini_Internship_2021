package com.selfLearning.Encapsulation;

/*
	Access Levels
	
	Modifier		Class	Package	  Subclass   World
	---------------------------------------------------
	public			  Y		   Y  	     Y         Y
	protected		  Y        Y         Y         N
	no modifier		  Y		   Y   	 	 N		   N
	private			  Y        N         N         N
	---------------------------------------------------
*/

public class Student {
	private int id;
	private String name;
	private int age;
	private static int getstudentno = 0;

	Student() {
		getstudentno++;
		this.id = 1000;
		this.name = "Unspecified";
		this.age = 20;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getDetails() {
		System.out.println("\n***Non-static method calling***\nStudent Name -> " + name);
		System.out.println("Student ID -> " + id);
		System.out.println("Student Age -> " + age + " years\n");
	}

	public static void getDetailsStatic() {
		System.out.println("\n***Static method calling***\nTotal No. of Students = " + getstudentno);
	}
}
