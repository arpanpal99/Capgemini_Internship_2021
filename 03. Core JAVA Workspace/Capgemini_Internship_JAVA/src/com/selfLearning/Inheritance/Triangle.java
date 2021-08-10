package com.selfLearning.Inheritance;

public class Triangle extends Polygon {

	public double getAreaGS() {
		Polygon p = new Polygon();
		p.setHeight(this.height);
		p.setWidth(this.width);
		return p.getMulti() * 0.5;
	}

	public double getArea() {
		return 0.5 * height * width;
	}
}
