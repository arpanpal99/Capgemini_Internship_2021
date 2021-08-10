package com.capgemini.loosecouplingexample;

public class Traveler {
	
	private Vehicle v;
	
	Traveler (){
		
	}
	
	Traveler (Vehicle v){
		this.v =v;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	public void startJourney() {
		v.move();
	}
}
