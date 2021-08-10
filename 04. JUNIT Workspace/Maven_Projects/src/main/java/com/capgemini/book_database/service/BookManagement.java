package com.capgemini.book_database.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.book_database.model.Book;
import com.capgemini.book_database.user_exceptions.ArrayListIsNullException;
import com.capgemini.book_database.user_exceptions.BookAlreadyFoundException;
import com.capgemini.book_database.user_exceptions.BookIDCannotBeNegative;
import com.capgemini.book_database.user_exceptions.BookNameCannotBeNull;
import com.capgemini.book_database.user_exceptions.BookNotFoundException;
import com.capgemini.book_database.user_exceptions.PriceIsNotValidException;

public class BookManagement {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> bookList = new ArrayList<Book>();
	static Iterator<Book> bookItr; 
	
	private static void displayBook(Book bk) {
		
		System.out.println("--------------------------------");
		System.out.println("1. Book ID\t: " + bk.getbId());
		System.out.println("2. Book Name\t: " + bk.getbName());
		System.out.println("3. Book Price\t: " + bk.getPrice());
		System.out.println("--------------------------------");
		
	}
	
	public static void manageBooks() throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException, BookAlreadyFoundException, ArrayListIsNullException, BookNotFoundException {
		
		int choice = 1, num, i, bId, bPrice;
		String bName;
		while(choice != 5) {
			
			System.out.print(   "************************************************************\n"
								+ "1. Create new books in the database\n"
								+ "2. Read all the books in the database\n"
								+ "3. Update an existing customer details\n"
								+ "4. Delete an existing customer from the database\n"
								+ "5. Press 5 to exit the Portal\n"
								+ "Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("************************************************************");
			switch(choice) {
			
			case 1: 	// CREATE
						System.out.print("Enter how many books to register: "); num = sc.nextInt();
						for(i = 0; i < num; i++) {
							System.out.println("------------------------------------------------");
							System.out.println("* Enter details for book no. " + (i+1));
							System.out.println("------------------------------------------------");
							System.out.print("1. Enter book ID\t: "); 	bId = sc.nextInt();
							System.out.print("2. Enter book name\t: ");	bName = sc.next();
							System.out.print("3. Enter book price\t: "); 	bPrice = sc.nextInt();
							Book bl = new Book(bId, bName, bPrice);
							checkDuplicate(bookList, bl);
							
						}
						break;
						
			case 2: 	// READ
						System.out.println("Reading all the books from the Database:");
						checkEmptyArrayList(bookList);
						bookItr = bookList.iterator();
						while(bookItr.hasNext()) {
							Book bk = bookItr.next();
							displayBook(bk);
						}
						break;
						
			case 3:		// UPDATE
						System.out.println("Enter the Book ID to update book details: ");
						bId = sc.nextInt();
						checkBookPresentOrNot(bookList, bId);
						bookItr = bookList.iterator();
						while(bookItr.hasNext()) {
							Book bk = bookItr.next();
							if(bk.getbId() == bId) {
								System.out.print("Enter Book name: ");
								bk.setbName(sc.next());
								System.out.print("Enter Book price: ");
								bk.setPrice(sc.nextInt());
								System.out.println("Book ID: " + bId + " is modified..");
								break;
							}
						}
						break;
						
						
			case 4:		// DELETE
						System.out.println("Enter the Book ID to update book details: ");
						bId = sc.nextInt();
						checkBookPresentOrNot(bookList, bId);
						bookItr = bookList.iterator();
						while(bookItr.hasNext()) {
							Book bk = bookItr.next();
							if(bk.getbId() == bId) {
								bookItr.remove();
								System.out.println("Book ID: " + bId + " is deleted..");
								break;
							}
						}
						break;
						
			case 5: 	System.out.println("**************************");
						System.out.println("Exiting from the portal...");
						break;
			
			default:	System.out.println("Wrong choice..!");
			 			break;
				
			}
		}

	}
	
	// Exception throwings
	public static void checkBookPresentOrNot(ArrayList<Book> bList, int bId) throws BookNotFoundException {
		bookItr = bList.iterator();
		while(bookItr.hasNext()) {
			Book bk = bookItr.next();
			if(bk.getbId() == bId) { return; }
		}
		throw new BookNotFoundException("Book not found in the database");
	}
	public static void checkDuplicate(ArrayList<Book> bList, Book bl) throws BookAlreadyFoundException {
			bookItr = bList.iterator();
			while(bookItr.hasNext()) {
				Book bk = bookItr.next();
				if(bk.getbId() == bl.getbId()) throw new BookAlreadyFoundException("\nBook already exists");
			}
			bookList.add(bl);
	}
	public static void checkEmptyArrayList(ArrayList<Book> bList) throws ArrayListIsNullException {
		if(bList.size() == 0) throw new ArrayListIsNullException("\nBook database is empty");
	}
}
