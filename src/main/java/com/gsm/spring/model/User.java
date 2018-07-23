package com.gsm.spring.model;

import javax.persistence.Entity;

@Entity
public class User {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
