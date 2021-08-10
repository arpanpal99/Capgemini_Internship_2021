package com.capgemini.book_database.user_exceptions;

public class PriceIsNotValidException extends Exception {

	private static final long serialVersionUID = 1L;

	public PriceIsNotValidException(String s) {
		super(s);
	}
}