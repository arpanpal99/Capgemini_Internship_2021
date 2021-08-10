package com.capgemini.book_database.user_exceptions;

public class BookAlreadyFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookAlreadyFoundException(String s) {
		super(s);
	}
}