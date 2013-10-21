package de.chemmedia.demo.vegetables.impl;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class TomatoTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorBlank() throws Exception {
		new Tomato("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorNull() throws Exception {
		new Tomato(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorWhite() throws Exception {
		new Tomato("  ");
	}
	
	@Test
	public void testTomato() {
		Tomato tomato = new Tomato("Heinz");
		assertThat(tomato.getName(), CoreMatchers.equalTo("Heinz"));
	}
}
