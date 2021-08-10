package com.capgemini.assignment.Day06b;

public class Square extends Rectangle {
//    Methods
	public double getSide() {
		return length;
	}

	public void setSide() {
		this.length = length;
	}

	public void setLength() {
		this.length = length;
	}

	public void setWidth() {
		this.length = length;
	}

	public double getArea() {
		return length * length;
	}

	public double getPerimeter() {
		return 4 * length;
	}

//    toString
	public String toString() {
		Rectangle re = new Rectangle();
		return "Square[ " + re + " ]";
	}
}
