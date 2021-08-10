package com.selfLearning.Inheritance;

public class Polygon {

	public int height;
	public int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getMulti() {
		return this.getHeight() * this.getWidth();
	}

	public void set_values(int height, int width) {
		this.height = height;
		this.width = width;
	}
}
