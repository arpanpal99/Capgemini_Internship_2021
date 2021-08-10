package com.capgemini.book_database.user_exceptions;

public class BookIDCannotBeNegative extends Exception {

	private static final long serialVersionUID = 1L;

	public BookIDCannotBeNegative(String s) {
		super(s);
	}
}