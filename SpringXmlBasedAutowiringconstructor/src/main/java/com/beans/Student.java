package com.beans;

public class Student {

	private int id;
	private String name;
	private Address address;
	
	public Student(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	
	
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
	
}
