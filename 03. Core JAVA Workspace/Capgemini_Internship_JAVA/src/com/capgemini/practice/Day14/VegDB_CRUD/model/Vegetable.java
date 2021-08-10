package com.capgemini.practice.Day14.VegDB_CRUD.model;

import java.util.Comparator;

public class Vegetable implements Comparable<Vegetable>, Comparator<Vegetable> {

	private int vegID;
	private String vegName;
	private float vegPrice;
	
	public Vegetable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getVegID() {
		return vegID;
	}

	public void setVegID(int vegID) {
		this.vegID = vegID;
	}

	public String getVegName() {
		return vegName;
	}

	public void setVegName(String vegName) {
		this.vegName = vegName;
	}

	public float getVegPrice() {
		return vegPrice;
	}

	public void setVegPrice(float vegPrice) {
		this.vegPrice = vegPrice;
	}

	public Vegetable(int vegID, String vegName, float vegPrice) {
		super();
		this.vegID = vegID;
		this.vegName = vegName;
		this.vegPrice = vegPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vegID;
		result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
		result = prime * result + Float.floatToIntBits(vegPrice);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (vegID != other.vegID)
			return false;
		if (vegName == null) {
			if (other.vegName != null)
				return false;
		} else if (!vegName.equals(other.vegName))
			return false;
		if (Float.floatToIntBits(vegPrice) != Float.floatToIntBits(other.vegPrice))
			return false;
		return true;
	}

	@Override
	public int compareTo(Vegetable vg) {// TODO Auto-generated method stub
		return vegName.compareTo(vg.vegName);
	}

	@Override
	public int compare(Vegetable vg1, Vegetable vg2) {
		// TODO Auto-generated method stub
		return vg1.vegName.compareTo(vg2.vegName);
	}

	
}
