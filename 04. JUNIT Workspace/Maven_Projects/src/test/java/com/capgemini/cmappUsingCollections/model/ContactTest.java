package com.capgemini.cmappUsingCollections.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.cmapp_using_collections.model.Contact;
import com.capgemini.cmapp_using_collections.service.ContactManager;

class ContactTest {

	static Contact cont;
	static Contact cont1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont = new Contact("Mark", "Rober", "06589365265");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		cont1 = new Contact();
	}

	@AfterEach
	void tearDown() throws Exception {
		cont1 = null;
	}

	@Test
	void testGetfName() {
		assertEquals("Mark", cont.getfName());
	}

	@Test
	void testGetlName() {
		assertEquals("Rober", cont.getlName());
	}

	@Test
	void testGetPhNo() {
		assertEquals("06589365265", cont.getPhNo());
	}
	@Test
	void testContact() {
		assertEquals(new Contact(), cont1);
	}
}
