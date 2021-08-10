package com.capgemini.tightcouplingexample;

public class Traveler {
	Car c = new Car();
	
	public void startJourney() {
		c.move();
	}
}