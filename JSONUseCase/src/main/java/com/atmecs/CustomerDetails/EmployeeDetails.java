package com.atmecs.CustomerDetails;
/**
 * This class is used to get the  details from the employee
 * @author Anne.Sivakumar
 *
 */
public class EmployeeDetails {
	//make the data member as hidden
	private transient int employeeid;
	private String employeename;
	private int employeeage;
	private String employeegender;
	private boolean employeeverification;
	public static String Department;
//get employee id
	public int getEmployeeid() {
		return employeeid;
	}
	//set employee id
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	//get employee name
	public String getEmployeename() {
		return employeename;
	}
	//set employee name
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	//get employee age
	public int getEmployeeage() {
		return employeeage;
	}
	//set employee age
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	//get employee gender
	public String getEmployeegender() {
		return employeegender;
	}
	//set employee gender
	public void setEmployeegender(String employeegender) {
		this.employeegender = employeegender;
	}
	//get employee verification is done or not
	public boolean isEmployeeverification() {
		return employeeverification;
	}
	//set employee verification is done or not
	public void setEmployeeverification(boolean employeeverification) {
		this.employeeverification = employeeverification;
	}


}
