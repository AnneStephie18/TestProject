package com.atmecs.CustomerDetails;

import java.lang.reflect.Modifier;
import java.util.Scanner;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to exclude few fields while serializing using transient keyword
 */
public class GsonExcludeFieldFromSerialization {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting(); 
		//exclude some field using method of GSON builder as transient
		builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
		Gson gson = builder.create();
		Logger log = Logger.getLogger(GsonExcludeFieldFromSerialization.class.getName());
		EmployeeDetails employee = new EmployeeDetails();
		log.info("Enter your Id:");
		int employeeid=sc.nextInt();
		employee.setEmployeeid(employeeid);
		log.info("Enter your Name:");
		String employeename=sc.next();
		employee.setEmployeename(employeename);
		log.info("Enter your Age:");
		int employeeage=sc.nextInt();
		employee.setEmployeeage(employeeage);
		log.info("Enter your Gender:");
		String employeegender=sc.next();
		employee.setEmployeegender(employeegender);
		log.info("Verification true/false:");
		boolean employeeverification=sc.nextBoolean();
		employee.setEmployeeverification(employeeverification);
		log.info("Enter your Department:");
		String employeedepartment=sc.next();
		employee.Department =employeedepartment ;
		log.info("Enter your salary:");
		double employeesalary=sc.nextDouble();
		employee.setSalary(employeesalary);
		//using GSON library serialize java objects to JSON
		String jsonString = gson.toJson(employee);
		log.info(jsonString);
	}

}
