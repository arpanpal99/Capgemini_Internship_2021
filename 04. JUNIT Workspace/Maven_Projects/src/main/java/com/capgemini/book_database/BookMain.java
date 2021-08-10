package com.capgemini.book_database;

import com.capgemini.book_database.service.BookManagement;
import com.capgemini.book_database.user_exceptions.ArrayListIsNullException;
import com.capgemini.book_database.user_exceptions.BookAlreadyFoundException;
import com.capgemini.book_database.user_exceptions.BookIDCannotBeNegative;
import com.capgemini.book_database.user_exceptions.BookNameCannotBeNull;
import com.capgemini.book_database.user_exceptions.BookNotFoundException;
import com.capgemini.book_database.user_exceptions.PriceIsNotValidException;

public class BookMain {

	public static void main(String[] args) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException, BookAlreadyFoundException, ArrayListIsNullException, BookNotFoundException {
		
		BookManagement.manageBooks();
		
	}
	

}
