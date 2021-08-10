package com.capgemini.assignment.Day10;

import java.util.Date;

public class ArrayList_CustomerClass {

	private int custID;
	private String custName;
	private int custAge;
	private Date custDOB = new Date();
	private String custEmail;
	private String custMobileNum;

	// Constructors
	public ArrayList_CustomerClass(int custID, String custName, int custAge, Date custDOB, String custEmail, String custMobileNum) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAge = custAge;
		this.custDOB = custDOB;
		this.custEmail = custEmail;
		this.custMobileNum = custMobileNum;
	}
	public ArrayList_CustomerClass() {
		super();
	}
	
	// Getters & Setters
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public Date getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustMobileNum() {
		return custMobileNum;
	}
	public void setCustMobileNum(String custMobileNum) {
		this.custMobileNum = custMobileNum;
	}
	
	
}
