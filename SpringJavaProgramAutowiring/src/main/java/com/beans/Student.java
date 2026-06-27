package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int id;
	private String name;
	@Autowired
	
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
	
	
}
