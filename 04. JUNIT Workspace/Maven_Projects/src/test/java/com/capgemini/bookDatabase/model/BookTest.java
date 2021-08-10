package com.capgemini.bookDatabase.model;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.book_database.model.Book;
import com.capgemini.book_database.service.BookManagement;
import com.capgemini.book_database.user_exceptions.ArrayListIsNullException;
import com.capgemini.book_database.user_exceptions.BookAlreadyFoundException;
import com.capgemini.book_database.user_exceptions.BookIDCannotBeNegative;
import com.capgemini.book_database.user_exceptions.BookNameCannotBeNull;
import com.capgemini.book_database.user_exceptions.BookNotFoundException;
import com.capgemini.book_database.user_exceptions.PriceIsNotValidException;


class BookTest {

	private static ArrayList<Book> bList;
	private static Book bk1; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all classes");
		bList = new ArrayList<Book>();
		bList.add(new Book(1001, "Beyond Universe", 850));
		bList.add(new Book(1002, "At Namek", 250));
		bList.add(new Book(1003, "The 3D Shadow", 6589));
		bk1 = new Book(1003, "The Zeno Word", 9500); 
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all classes");

	}

	
	@Test
	@DisplayName("Testing BookIDCannotBeNegative")
	public void testBookId() {
		Assertions.assertThrows(BookIDCannotBeNegative.class, () -> { new Book(-1005, "ABC", 652);});
	}
	@Test
	@DisplayName("Testing BookNameCannotBeNull")
	public void testBookName() {
		Assertions.assertThrows(BookNameCannotBeNull.class, () -> { new Book(1005, "", 652);});
	}
	@Test
	@DisplayName("Testing PriceIsNotValidException")
	public void testBookPrice() {
		Assertions.assertThrows(PriceIsNotValidException.class, () -> { new Book(1005, "ABC", -652);});
	}
	
	@Test
	@DisplayName("Testing BookAlreadyFoundException")
	public void testDuplicateBook() {
		Assertions.assertThrows(BookAlreadyFoundException.class, () -> { BookManagement.checkDuplicate(bList, bk1);});
	}
	
	@Test
	@DisplayName("Testing ArrayListIsNullException")
	public void testEmptyArrayList() {
		ArrayList<Book> bList = new ArrayList<Book>();
		Assertions.assertThrows(ArrayListIsNullException.class, () -> { BookManagement.checkEmptyArrayList(bList);});
	}
	
	@Test
	@DisplayName("Testing BookNotFoundException")
	public void testBookNotFound() {
		Assertions.assertThrows(BookNotFoundException.class, () -> { BookManagement.checkBookPresentOrNot(bList, 1004); });
	}

	
}
