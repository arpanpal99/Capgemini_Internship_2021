package com.capgemini.cmapp_using_collections.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.cmapp_using_collections.model.Contact;

public class ContactManager {

	Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

	/*
	 * add contact method to add contact in to contactList Object with arguments
	 * 
	 * @param argCisId gets the first name of contact
	 * 
	 * @param lastNme gets the last name of the contact.
	 * 
	 * @param PhoneNo gets the phone name of the contact.
	 * 
	 */

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param phoneNO
	 */
	public void addContact(String firstName, String lastName, String phoneNo) {
		Contact contact = new Contact(firstName, lastName, phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);

	}

	/**
	 * generate contact key
	 * 
	 * @param contact
	 * @return
	 */

	private String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", contact.getfName(), contact.getlName());
	}

	/**
	 * 
	 * @param contact
	 */

	private void validateContact(Contact contact) {
		// TODO Auto-generated method stub

		contact.validateFirstNAme();
		contact.validateLastNAme();
		contact.validatePhoneNo();

	}

	/**
	 * check if contact already exist
	 * 
	 * @param contact
	 */

	private void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
		if (contactList.containsKey(generateKey(contact))) {
			throw new RuntimeException("Contact Alreasy Exist");
		}

	}

	/**
	 * 
	 * @return all values of contact list
	 */

	public Collection<Contact> getAllContacts() {
		return contactList.values();
	}

}