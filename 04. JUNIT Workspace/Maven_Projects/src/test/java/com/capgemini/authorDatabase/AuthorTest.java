package com.capgemini.authorDatabase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.author_database.Author;

class AuthorTest {

	private static Author ar1;
	private static Author ar2;
	private static Author ar3;
	private static Author ar4;
	
	@BeforeAll
	@DisplayName("Should create Authors...")
	static void setUpBeforeClass() throws Exception {
		System.out.println("Should print before all tests...");
		ar1 = new Author("William", "will.i.am@gm.com", 'm');
		ar2 = new Author("Angela", "angela@gm.com", 'f');
		ar3 = new Author("Namek", "namekian@gm.com", 'u');
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Should print before each test...");
		System.out.println("Testing an author");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Should execute after each test...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Should execute at the very end...");
		ar1 = null;
		ar2 = null;
		ar3 = null;
	}
	
	@Test
	void testGetName() {
		assertEquals("William", ar1.getName());
		assertEquals("Angela", ar2.getName());
		assertEquals("Namek", ar3.getName());
	}
	
	@Test
	void testGetEmail() {
		assertEquals("will.i.am@gm.com", ar1.getEmail());
		assertEquals("angela@gm.com", ar2.getEmail());
		assertEquals("namekian@gm.com", ar3.getEmail());
	}
	
	@Test
	void testGetGender() {
		assertEquals('m', ar1.getGender());
		assertEquals('f', ar2.getGender());
		assertEquals('u', ar3.getGender());
	}
	
	@Test
	@DisplayName("Should throw RuntimeException when Name Is Null...")
	public void shouldThrow_RTExc_WhenNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {new Author(null, "will.i.am@gm.com", 'm');});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Email Is Null...")
	public void shouldThrow_RTExc_WhenEmailIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {new Author("William", null, 'm');});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Email doesn't have '@'...")
	public void shouldThrow_RTExc_WhenEmailIsntValid() {
		Assertions.assertThrows(RuntimeException.class, () -> {new Author("William", "will.i.amgm.com", 'm');});
	}
	@Test
	@DisplayName("Should throw RuntimeException when Gender is invalid...")
	public void shouldThrow_RTExc_WhenGenderIsntValid() {
		Assertions.assertThrows(RuntimeException.class, () -> {new Author("William", "will.i.amgm.com", 'd');});
	}
	
	@Test
	@DisplayName("Validating Constructors")
	void testAuthor() {
		ar4 = new Author("Mike", "mike@gmail.com", 'u');
		assertEquals(new Author("Mike", "mike@gmail.com", 'u'), ar4);
	}

	/*
	@Test
	void testPrint() {
		fail("Not yet implemented");
	}
	 */
}
