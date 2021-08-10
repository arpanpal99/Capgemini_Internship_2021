package com.capgemini.loosecouplingexample;

public class MainLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveler traveler = new Traveler();
		//Dependency Injection or Inversion of Control
		traveler.setV(new Car());//Car object is passed to interface
		traveler.startJourney();
		traveler.setV(new Bus());//Bus object is passed to interface
		traveler.startJourney();
		traveler.setV(new Flight());//Bus object is passed to interface
		traveler.startJourney();
	}

}
