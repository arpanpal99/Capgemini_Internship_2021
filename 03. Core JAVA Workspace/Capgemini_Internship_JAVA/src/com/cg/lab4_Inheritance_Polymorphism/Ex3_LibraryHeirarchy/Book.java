package com.cg.lab4_Inheritance_Polymorphism.Ex3_LibraryHeirarchy;

public class Book extends WrittenItem {
	Book(int id, String title, int nC, String author) {
		super(id, title, nC, author);
	}

//    Getters
	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumberOfCopies() {
		return super.getNumberOfCopies();
	}

//    Methods
	public void print() {
		System.out.println("----------------------------------------");
		System.out.println("Display information about book:");
		System.out.println("----------------------------------------");
		super.print();
		System.out.println("Author of the book: " + super.getAuthor());
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}

	public void addItems() {
		super.addItems();
	}
}
