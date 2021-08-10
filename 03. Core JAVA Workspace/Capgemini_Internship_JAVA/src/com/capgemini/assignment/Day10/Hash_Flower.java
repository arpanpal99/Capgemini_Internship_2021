package com.capgemini.assignment.Day10;

public class Hash_Flower {

	private int fID;
	private String fName;
	private double pricePerKG;
	private double qtyKG;

	public Hash_Flower(int fID, String fName, double pricePerKG, double qtyKG) {
		super();
		this.fID = fID;
		this.fName = fName;
		this.pricePerKG = pricePerKG;
		this.qtyKG = qtyKG;
	}

	public Hash_Flower() {
		super();
	}

	public int getfID() {
		return fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getPricePerKG() {
		return pricePerKG;
	}

	public void setPricePerKG(double pricePerKG) {
		this.pricePerKG = pricePerKG;
	}

	public double getQtyKG() {
		return qtyKG;
	}

	public void setQtyKG(double qtyKG) {
		this.qtyKG = qtyKG;
	}
}
