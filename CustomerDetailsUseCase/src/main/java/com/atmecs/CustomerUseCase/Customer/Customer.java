package com.atmecs.CustomerUseCase.Customer;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to get the details of bike customer
 */
public class Customer {
	

		private String firstname;
		private String lastname;
		private int age;
		private int phone;
		private String sex;
		private String address;
		private String city;
		private String state;
		private int pincode;
		private String country;
		private String email;
		
		
		public Customer(String firstname, String lastname, int age,int phone, String sex,String address,String city,String state,int pincode,String country,String email) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.age = age;
	        this.phone = phone;
	        this.sex = sex;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.pincode = pincode;
	        this.country = country;
	        this.email = email;
	    }
		//get the first name of the customer
		
		public String getFirstname() {
			return firstname;
		}
		//set the first name of the customer
		public void setFirstname(String firstname)
		{
			this.firstname = firstname;
		}
		
		
		//get the last name of the customer
		public String getLastname() {
			return lastname;
		}
		//set the last name of the customer
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		//get the age of the customer
		public int getAge() {
			return age;
		}
		//set the age of the customer
		public void setAge(int age) {
			this.age = age;
		}
		//get the phone of the customer
		public int getPhone() {
			return phone;
		}
		//set the phone of the customer
		public void setPhone(int phone) {
			this.phone = phone;
		}
		//get the sex of the customer
		public String getSex() {
			return sex;
		}
		//set the sex of the customer
		public void setSex(String sex) {
			this.sex = sex;
		}
		//get the address of the customer
		public String getAddress() {
			return address;
		}
		//set the address of the customer
		public void setAddress(String address) {
			this.address = address;
		}
		//get the city of the customer
		public String getCity() {
			return city;
		}
		//set the city of the customer
		public void setCity(String city) {
			this.city = city;
		}
		//get the state of the customer
		public String getState() {
			return state;
		}
		//set the state of the customer
		public void setState(String state) {
			this.state = state;
		}
		//get the pincode of the customer
		public int getPincode() {
			return pincode;
		}
		//set the pincode of the customer
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		//get the country of the customer
		public String getCountry() {
			return country;
		}
		//set the country of the customer
		public void setCountry(String country) {
			this.country = country;
		}
		//get the  email of the customer
		public String getEmail() {
			return email;
		}
		//set the  email of the customer
		public void setEmail(String email) {
			this.email = email;
		}
	}

