package com.capgemini.contactmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.cmapp_without_collections.Contact;

public class ContactTest {
/*
	public static Contact ct;

	@BeforeAll
	public static void setUp() {
		System.out.println(
				"This method is annotated with @BeforeAll to execute as the first method in the test class ContactTest\n"
						+ "---------------------------------------------------------------");
		ct = new Contact();
	}

	@BeforeEach
	public void setUpForTest() {
		System.out.println(
				"This method is annotated with @BeforeEach to be executed before each method in the test class ContactTest\n"
						+ "---------------------------------------------------------------");
		ct.validateReadDetails();
	}

	@Test
	public void testContact() {
		// Contact ct = new Contact("Mark", "Rober", "0987561452");
		assertNotNull(ct);
		Contact ctOne = new Contact();
		// assertNull(ctOne);

	}

	@Test
	public void testGetters() {
		assertEquals("Mark", ct.getFirstName());
		assertEquals("Rober", ct.getLastName());
		assertEquals("0987561452", ct.getMobileNumber());
	}

	@Test
	public void testValidateFirstName() {
		assertSame("* First Name is valid", ct.validateFirstName(ct.getFirstName()));
		assertNotSame("* First Name cannot be null", ct.validateFirstName(ct.getFirstName()));
	}

	@Test
	public void testValidateLastName() {
		assertSame("* Last Name is valid", ct.validateLastName(ct.getLastName()));
		assertNotSame(null, ct.validateLastName(ct.getLastName()));
	}

	@Test
	public void testValidateMobNum() {
		assertSame("* Mobile number is valid", ct.validateMobileNo(ct.getMobileNumber()));
		assertNotSame(null, ct.validateMobileNo(ct.getMobileNumber()));

	}

	@Test
	public void testDisplayDetails() {
		assertEquals(new String("The mobile number of Mark Rober is: 0987561452"), ct.displayDetails());
		assertNotEquals(new String("Something else"), ct.displayDetails());
	}

	@AfterEach
	public void stopThis() {
		System.out.println("this method is annoted with @AfterEach to execute after each test case");
	}

	@AfterAll
	public static void stopAll() {
		System.out.println(
				"this method is annoted with @AfterAll to execute as last method in the test class ContactTest");
		ct = null;// now after assigning ct object to null it is eligible for removing from the
					// memory
	}*/

}

//0987561452
