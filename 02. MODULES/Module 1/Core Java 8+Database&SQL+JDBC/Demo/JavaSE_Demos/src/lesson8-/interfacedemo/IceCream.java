package com.capgemini.lesson7.interfacedemo;

public class IceCream extends Sweet {

	public String purchaseIceCream()
	{
		return "Candy / slice / cup";
	}
	
	@Override
	public String consume() {
		// TODO Auto-generated method stub
		return "Eat when ice frozen";
	}

}
