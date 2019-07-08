package com.atmecs.CustomerDetails;

import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to serialize null fields with serializeNulls method in the GSON builder and de-serialize
 */
public class GsonSerializeNullFieldsAndDeserialize {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(GsonSerializeNullFieldsAndDeserialize.class.getName());
		GsonBuilder builder = new GsonBuilder(); 
		//serialize null fields
	     builder.serializeNulls(); 
	    //printing format of JSON 
	     builder.setPrettyPrinting(); 
	     //creating builder 
	     Gson gson = builder.create(); 
		EmployeeDetails employee = new EmployeeDetails();
		employee.setEmployeeid(1018);
		employee.setEmployeeage(23);
		employee.setEmployeegender("Female");
		employee.setEmployeeverification(true);
		employee.setSalary(25000.0);
		employee.Department = "Software Engineer";
		//using GSON library serialize java objects to JSON
		String jsonString = gson.toJson(employee);
		log.info(jsonString);
		//using GSON library de-serialize JSON to java objects 
		employee = gson.fromJson(jsonString, EmployeeDetails.class);
		log.info("Employee ID: "+employee.getEmployeeid());
		log.info("Employee Name: "+employee.getEmployeename());
		log.info("Employee Age: "+employee.getEmployeeage());
		log.info("Employee Gender: "+employee.getEmployeegender());
		log.info("Employee Department: "+employee.Department);
		log.info("Employee Salary: "+employee.getSalary());
	}

}
