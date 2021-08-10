package com.cg.lab5_Exception_Handling.Ex1_ValidateAge;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s) {
		super(s);
	}
}