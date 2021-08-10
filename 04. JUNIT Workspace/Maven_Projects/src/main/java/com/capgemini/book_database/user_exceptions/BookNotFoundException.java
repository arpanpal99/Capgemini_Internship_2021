package com.capgemini.book_database.user_exceptions;

public class BookNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String s) {
		super(s);
	}
}