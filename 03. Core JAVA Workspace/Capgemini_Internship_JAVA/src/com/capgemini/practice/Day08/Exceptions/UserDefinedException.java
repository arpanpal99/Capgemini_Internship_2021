package com.capgemini.practice.Day08.Exceptions;

class InvalidContactException extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidContactException(String s) {
		super(s);
	}
}

public class UserDefinedException extends Exception {

	String message;

	UserDefinedException(String msg) {
		super(msg);
		message = msg;
	}

}
