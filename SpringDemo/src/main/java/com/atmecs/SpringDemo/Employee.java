package com.atmecs.SpringDemo;
/**
 * POJO(pain old java object)/Bean/Model
 * @author Anne.Sivakumar
 *
 */
public class Employee {
int eid;
String ename;
String dept;
Address address;
public Employee()
{
	System.out.println("deafault constructor");
}
public Employee(Address address)
{
	this.address=address;
}

public int getEid() {
	return eid;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", address=" + address + "]";
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void init()
{
	System.out.println("object initialized");
}
public void destroy()
{
	System.out.println("object destroyed");
}

}
