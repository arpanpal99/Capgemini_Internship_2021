package com.capgemini.assignment.Day06a;

public class Student extends Person {

	public String program;
	public int year;
	public double fee;

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		Person p = new Person();
		p.setName(this.name);
		p.setAddress(this.address);
		return "Student" + p.toString() + ", program= " + getProgram() + ", year= " + getYear() + ", fee= " + getFee();
	}
}
