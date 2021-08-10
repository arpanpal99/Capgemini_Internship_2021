package com.capgemini.cmappUsingCollections.service;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.capgemini.cmapp_using_collections.service.ContactManager;

class ContactManagerTest {

	private ContactManager conManager;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Should print before all tests...");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Should print before each test...");
		System.out.println("Instantiating contact manager");
		conManager = new ContactManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Should execute after each test...");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Should execute at the very end...");
	}
	
	@Test
	@DisplayName("Should create contact...")
	public void shouldCreateContact() {
		conManager.addContact("Mark", "Rober", "06589325412");
		assertFalse(conManager.getAllContacts().isEmpty());
		assertEquals(1, conManager.getAllContacts().size());
	}

	@Test
	@DisplayName("Should throw RuntimeException when First Name Is Null...")
	public void shouldThrow_RTExc_WhenFirstNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {conManager.addContact(null, "Rober", "06589652336");});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Last Name Is Null...")
	public void shouldThrow_RTExc_WhenLastNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {conManager.addContact("Mark", null, "06589652336");});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Phone Number Is Null...")
	public void shouldThrow_RTExc_WhenPhoneNumberIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {conManager.addContact("Mark", "Rober", null);});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Phone Number doesnot Begin with 0...")
	public void shouldThrow_RTExc_WhenPhoneNumberBeginsWithZero() {
		Assertions.assertThrows(RuntimeException.class, () -> {conManager.addContact("Mark", "Rober", "65896523364");});
	}
	@Nested
	class RepeatedTests {
		@DisplayName("Should create contact")
		@RepeatedTest(value = 5, name = "Repeated contact creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateContactRepeatedly() {
			conManager.addContact("Mark", "Rober", "06589325412");
			assertFalse(conManager.getAllContacts().isEmpty());
			assertEquals(1, conManager.getAllContacts().size());
		}
	}
	@Nested
	class ParameterizedTests {
		@DisplayName("Phone number should be valid")
		@ParameterizedTest
		@ValueSource(strings = {"09636725412", "06582145412", "01452325412"})
		public void shouldTestPhNum_WithValueSource(String phoneNo) {
			conManager.addContact("Mark", "Rober", phoneNo);
			assertFalse(conManager.getAllContacts().isEmpty());
			assertEquals(1, conManager.getAllContacts().size());
		}
	}
	
	private static List<String> phNumList() {
		return Arrays.asList("09636725412", "06582145412", "01452325412");
	}
	
	@DisplayName("Testing phone numbers in required format using Method Source")
	@ParameterizedTest
	@MethodSource("phNumList")
	public void shouldTestPhNum_WithMethodSource(String phoneNo) {
		conManager.addContact("Mark", "Rober", phoneNo);
		assertFalse(conManager.getAllContacts().isEmpty());
		assertEquals(1, conManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disable a test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("This is a disabled test");
	}
	
	
	
	
	/*
	@Test
	void testAddContact() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllContacts() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}
	*/
}
