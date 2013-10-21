package de.chemmedia.demo.vegetables.impl;

import org.apache.commons.lang3.StringUtils;

import de.chemmedia.demo.vegetables.Vegetables;

public class Tomato implements Vegetables {

	private String name;

	public Tomato(String name) {
		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException("Name must be set");
		}
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
