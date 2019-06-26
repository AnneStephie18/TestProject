package com.atmecs.LogManager;

public class UserObject {

		 
	    private String name;
	    private String age;
	    private String country;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getAge() {
	        return age;
	    }
	    public void setAge(String age) {
	        this.age = age;
	    }
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }
	    public UserObject(String name, String age, String country) {
	        super();
	        this.name = name;
	        this.age = age;
	        this.country = country;
	    }
	 
	}


