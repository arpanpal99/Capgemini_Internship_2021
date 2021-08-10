package com.selfLearning.Inheritance;

public class Rectangle extends Polygon {
	public double getAreaGS() {
		Polygon p = new Polygon();
		p.setHeight(this.height);
		p.setWidth(this.width);
		return p.getMulti();
	}

	public double getArea() {
		return height * width;
	}
}
