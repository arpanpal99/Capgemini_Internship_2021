package com.capgemini.assignment.Day11.CollectionsCaseStudy;

public interface CardScanner {

	public boolean AcceptCard();
	public void ReadCard();
	public void EjectCard();
	public boolean ValidatePin(int pin);
	
}
