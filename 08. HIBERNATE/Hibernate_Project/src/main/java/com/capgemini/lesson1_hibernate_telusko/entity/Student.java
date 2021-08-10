package com.capgemini.lesson1_hibernate_telusko.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private int marks;
//	@OneToOne
//	private Laptop lapt;
	
	@ManyToMany(mappedBy = "studList")	// 'studList' Present in Laptop class
	private List<Laptop> laptopList = new ArrayList<Laptop>(); 

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public Student(int rollno, String name, int marks, List<Laptop> laptopList) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.laptopList = laptopList;
	}
	public List<Laptop> getLaptopList() {
		return laptopList;
	}
}
