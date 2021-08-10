package com.capgemini.lesson1_hibernate_telusko.entity;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

	private String fName;
	private String mName;
	private String lName;
	
	public AlienName(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "AlienName [fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
	public AlienName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getfName() {
		return fName;
	}
	public String getmName() {
		return mName;
	}
	public String getlName() {
		return lName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
}
