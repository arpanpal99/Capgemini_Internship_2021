package com.capgemini.lesson1_hibernate_telusko.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
//	@ManyToOne
//	private Student stud;
	
	@ManyToMany
	private List<Student> studList = new ArrayList<Student>();
	
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public List<Student> getStudList() {
		return studList;	
	}
	
}
