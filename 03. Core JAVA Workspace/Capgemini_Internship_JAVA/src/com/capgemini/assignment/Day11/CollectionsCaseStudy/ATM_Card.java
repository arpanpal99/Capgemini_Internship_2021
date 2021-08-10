package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Date;
import java.util.regex.Pattern;

public class ATM_Card extends Account implements CardScanner {

	private int pin;
	private long cardID;
	
	public ATM_Card() {
		super();
	}
	public ATM_Card(int pin, long cardID, int custID, String custName, int custAge, Date custDOB, String custEmail, long custMobileNum, double balance) {
		super(custID, custName, custAge, custDOB, custEmail, custMobileNum, balance);
		this.pin = pin;
		this.cardID = cardID;
	}
	public long getCardID() {
		return cardID;
	}
	public void setCardID(long cardID) {
		this.cardID = cardID;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int number) {
		this.pin = number;
	}
	public String toString() {
		System.out.println("CardId: " + getCardID() + "\nPIN: " + getPin());
		return ("CardId: " + getCardID() + "\nPIN: " + getPin());
	}
	@Override
	public boolean AcceptCard() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void ReadCard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void EjectCard() {
		// TODO Auto-generated method stub
		
	}
	private static final String regPin = "^[0-9]{4}";
	@Override
	public boolean ValidatePin(int pin) {
		
		return Pattern.matches(regPin, Integer.toString(pin));
	}
}
