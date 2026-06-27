package com.beans;

public class Address {

	private int houseno;
	private String city;
	private int pincode;
	
	public void setHouseno(int houseno) {
		
		this.houseno = houseno;
	}
	public void setCity(String city) {
		
		this.city = city;
	}
	public void setPincode(int pincode) {
		
		this.pincode = pincode;
	}
	public int getHouseno() {
		return houseno;
	}
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
	@Override
	public String toString() {
		return "houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
	
	
	
}
