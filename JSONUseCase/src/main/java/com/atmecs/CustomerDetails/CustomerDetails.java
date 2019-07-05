package com.atmecs.CustomerDetails;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

import org.json.simple.parser.ParseException;


public class CustomerDetails {
	static void menu() throws FileNotFoundException, IOException, ParseException
	{
		Scanner sc = new Scanner(System.in);
		String model;
		WritingCustomerDetails writingintojson = new WritingCustomerDetails();
		ReadingCustomerDetails readingfromjson = new ReadingCustomerDetails();
		Logger log = Logger.getLogger(CustomerDetails.class.getName());
		int choice;
		log.info("1.Register Customer Details");
		log.info("2.Display Customer Details");
		
       do {
    	   log.info("Enter the choice");
		   choice = sc.nextInt();
    	   switch (choice) {
    	   //calling the WriteCustomerDetailsIntoJSON method in WritingCustomerDetails class.
		case 1:writingintojson.WriteCustomerDetailsIntoJSON();
			break;
			//calling the ReadCustomerDetailsIntoJSON method in ReadingCustomerDetails class.
		case 2:readingfromjson.ReadCustomerDetailsIntoJSON();
			break;
	}
   }while(choice<=4);
       {
		System.out.println("No Such Option");
	}
}
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		menu();
	}

}
