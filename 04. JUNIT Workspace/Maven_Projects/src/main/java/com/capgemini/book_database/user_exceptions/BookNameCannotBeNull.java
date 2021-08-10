package com.capgemini.book_database.user_exceptions;

public class BookNameCannotBeNull extends Exception {

	private static final long serialVersionUID = 1L;

	public BookNameCannotBeNull(String s) {
		super(s);
	}
}
