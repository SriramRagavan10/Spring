package com.junitproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator c = new Calculator();

	@Before
	public void display() {
		System.out.println("Hello");
	}

	@Test
	public void testAdd() {
		System.out.println(c.add(10, 44));
	}

	@Test
	public void testDiv() {
		c.division();
	}
	

	@After
	public void display1() {
		System.out.println("Bye");
	}

}
