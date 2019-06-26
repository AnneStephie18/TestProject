package com.atmecs.SpringDemo;

public class Address {
	String city;
	String state;
	int zipcode;
	public Address()
	{
		
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

}
