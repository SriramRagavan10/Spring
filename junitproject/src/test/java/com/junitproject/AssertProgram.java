package com.junitproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class AssertProgram {

	Calculator c = new Calculator();

	@Test
	public void testEquals() {
		assertEquals(5, c.add(2, 3));
	}

	@Test
	public void testNull() {
		assertNull(null, null);
	}

	@Test
	public void testTrue() {
		assertTrue(10 > 7);
	}

	@Test
	public void testSame() {
		assertSame("Sriram", "Sriram");
	}

	@Test
	public void testArrayEqual() {
		int[] a = { 5, 10, 20 };
		int[] b = { 5, 10, 20 };
		assertArrayEquals(a, b);
	}

	@Test
	public void testNotEquals() {
		assertNotEquals(5, c.add(7, 3));
	}

	@Test
	public void testNotNull() {
		assertNotNull("Magizhaal", "Suban");
	}

	@Test
	public void testNotTrue() {
		assertFalse(10 < 7);
	}

	@Test
	public void testNotSame() {
		assertNotSame("Sriram", "Raji");
	}

}
