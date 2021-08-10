package com.cg.lab4_Inheritance_Polymorphism.Ex3_LibraryHeirarchy;

public class MainClassLibrary {
	public static void main(String[] args) {
		Book b = new Book(1234, "The Lord of the Rings", 126000, "J.R.R. Tolkien");
		b.addItems();
		b.print();
		System.out.println("After checkout, number of copies left: ");
		b.checkOut();
		b.print();
		System.out.println("After adding one element, number of copies left: ");
		b.addItems();
		b.print();

		System.out.println();

		Video v = new Video(651, "Inception", 3000, 148, "Christopher Nolan", "Crime/Drama", 2010);
		v.addItems();
		v.print();
		System.out.println("After checking in, number of copies left: ");
		v.checkIn();
		v.print();

		System.out.println();

		CD c = new CD(3261, "In The Lonely Hour", 98600, 33, "Sam Smith", "Contemporary R&B");
		c.addItems();
		c.print();
		System.out.println("After checking out, number of copies left: ");
		c.checkOut();
		c.print();
	}
}
