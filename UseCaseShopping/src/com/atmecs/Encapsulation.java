package com.atmecs;

import java.util.logging.Logger;



public class Encapsulation {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Encapsulation.class.getName());
		EmployeeCount obj = new EmployeeCount ();
		obj.setEmpId(1018);
		obj.setEmpName("Anne Stephie");
		obj.setEmpAge(23);
		log.info("Employee Id: "+obj.getEmpId());
		log.info("Employee Name: "+obj.getEmpName());
		log.info("Employee Age: "+obj.getEmpAge());
	      obj.setNoOfEmployees(1018);
	      log.info("No Of Employees: "+(int)obj.getNoOfEmployees());
	}

}
class EmployeeCount
{
   private int numOfEmployees = 0;
   private int empid;
   private String empName;
   private int empAge;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public double getNoOfEmployees () 
   {
       return numOfEmployees;
   }
   public int getEmpId(){
       return empid;
   }

   public String getEmpName(){
       return empName;
   }

   public int getEmpAge(){
       return empAge;
   }

   public void setEmpAge(int newValue){
       empAge = newValue;
   }

   public void setEmpName(String newValue){
       empName = newValue;
   }

   public void setEmpId(int newValue){
	   empid = newValue;
   }
}