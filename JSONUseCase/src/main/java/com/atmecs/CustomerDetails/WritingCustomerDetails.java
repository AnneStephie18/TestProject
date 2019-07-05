package com.atmecs.CustomerDetails;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * This class is used to write customer details into json file
 * @author Anne.Sivakumar
 *
 */
public class WritingCustomerDetails {
	
	/**
	 * write customer details(first name,,middle name,last name,age,address,phone,gender,email id) into the json file
	 * @throws FileNotFoundException 
	 */
	static void WriteCustomerDetailsIntoJSON() throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("log information");
		
		// creating JSONObject 
		JSONObject jsonObject=new JSONObject();
		
		// putting name data,age data to JSONObject 
		log.info("Enter your FirstName:");
		jsonObject.put("FirstName",sc.next());
		log.info("Enter your MiddleName:");
		jsonObject.put("MiddleName",sc.next());
		log.info("Enter your LastName:");
		jsonObject.put("LastName",sc.next());
		log.info("Enter your Age:");
		jsonObject.put("Age",sc.next());
		log.info("Enter your Gender:");
		jsonObject.put("Gender",sc.next());
		
		// address data stored in  LinkedHashMap 
		Map map=new LinkedHashMap(6);
		log.info("Enter your StreetNumber:");
		map.put("StreetNumber",sc.nextInt());
		log.info("Enter your StreetName:");
		map.put("StreetName",sc.next());
		log.info("Enter your City:");
		map.put("City",sc.next());
		log.info("Enter your State:");
		map.put("State",sc.next());
		log.info("Enter your Country:");
		map.put("Country",sc.next());
		log.info("Enter your PostalCode:");
		map.put("PostalCode",sc.nextInt());
		
		// putting address to JSONObject 
		jsonObject.put("Address", map);
		
		//phone number stored in json array
		JSONArray JsonArray=new JSONArray();
		map=new LinkedHashMap(2);
		map.put("Type", "Home");
		log.info("Enter your HomeNumber:");
		map.put("Number",sc.nextLong());
		JsonArray.add(map);
		map=new LinkedHashMap(2);
		map.put("Type", "Mobile");
		log.info("Enter your MobileNumber:");
		map.put("Number",sc.nextLong());
		JsonArray.add(map);
		
		// putting phone number to JSONObject 
		jsonObject.put("phoneNumber", JsonArray);
		
		//putting college name data to JSONObject
		log.info("Enter your Email Id:");
		jsonObject.put("Email Id",sc.next());
		
		PrintWriter printwriter = new PrintWriter("CustomerDetailsInJSONFile.json"); 
		printwriter.write(jsonObject.toJSONString()); 
		printwriter.flush(); 
		printwriter.close(); 
		log.info("Successfully Writing Operation is Completed");
	}

}
