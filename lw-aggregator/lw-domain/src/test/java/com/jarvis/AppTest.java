package com.jarvis;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp0() {
		assertTrue(true);
	}

	@Test(expected=RuntimeException.class)
	public void testApp1() {
		assertTrue(true);
		throw new RuntimeException("hello");
	}

	@Test
	public void testApp2() {
		assertTrue(true);
	}
}
