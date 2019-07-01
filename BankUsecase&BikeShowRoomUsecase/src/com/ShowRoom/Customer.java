package com.ShowRoom;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to get the details of bike customer
 */
public class Customer {
	public String firstname;
	public String lastname;
	public int age;
	public int phone;
	public String sex;
	public String address;
	public String city;
	public String state;
	public int pincode;
	public String country;
	private String email;
	//get the first name of the customer
	public String getFirstname() {
		return firstname;
	}
	//set the first name of the customer
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	/**
     * return as a total of first name,last name,age,phone,sex,address,city,state,pincode,country,email of the bike customer
     */
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", phone=" + phone
				+ ", sex=" + sex + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", country=" + country + ", email=" + email + "]";
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
