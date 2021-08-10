package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Date;

public class BankCustomer extends ATM {

	private int custID;
	private String custName;
	private int custAge;
	private Date custDOB = new Date();
	private String custEmail;
	private long custMobileNum;

	// Constructors
	public BankCustomer(int custID, String custName, int custAge, Date custDOB, String custEmail, long custMobileNum) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAge = custAge;
		this.custDOB = custDOB;
		this.custEmail = custEmail;
		this.custMobileNum = custMobileNum;
	}
	public BankCustomer() {
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
	public long getCustMobileNum() {
		return custMobileNum;
	}
	public void setCustMobileNum(long custMobileNum) {
		this.custMobileNum = custMobileNum;
	}
	
	
}
