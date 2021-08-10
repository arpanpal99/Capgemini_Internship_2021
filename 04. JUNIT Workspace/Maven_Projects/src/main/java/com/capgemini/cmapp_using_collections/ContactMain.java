package com.capgemini.cmapp_using_collections;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.cmapp_using_collections.model.Contact;
import com.capgemini.cmapp_using_collections.service.ContactManager;

public class ContactMain {

	static Scanner ip = new Scanner(System.in);

	static String fname;
	static String lname;
	static String phNo;

	public static void main(String[] args) {
		ContactManager cm = new ContactManager();

		char choice = 'y';
		while (choice == 'y') {
			System.out.println("enter the choice");
			choice = ip.next().trim().charAt(0);
			switch (choice) {
			case 'a':
				readDetails();
				cm.addContact(fname, lname, phNo);
				break;

			case 'g':
				Collection<Contact> data = cm.getAllContacts();
				System.out.println(data);

				break;

			default:

				break;
			}// switch close
			System.out.println("do you want to continue?");
			choice = ip.next().trim().charAt(0);
		} // close while
		System.out.println("Program terminated");
	}

	public static void readDetails() {
		System.out.println("Enter the contact details");
		System.out.println("enter the first name:");
		fname = ip.next();
		System.out.println("enter the last name:");
		lname = ip.next();
		System.out.println("enter the phone no");
		phNo = ip.next();
	}
}
