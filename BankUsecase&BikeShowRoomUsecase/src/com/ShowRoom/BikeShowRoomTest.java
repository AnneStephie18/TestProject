package com.ShowRoom;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 
 * @author Anne.Sivakumar
 *This is test class of ShowRoom which gave access to all methods
 */

public class BikeShowRoomTest {
	/**
	 * This followed by switch case option as register the customer details,display the customer details,search the customer details,select the bike type
	 */
	static void menu()
	{
		Scanner sc = new Scanner(System.in);
		String model;
		RegistrationCustomerDetails registration = new RegistrationCustomerDetails();
		Dealer vehicle = new Dealer();
		Logger log = Logger.getLogger(BikeShowRoomTest.class.getName());
		int choice;
		log.info("1.Register Customer Details");
		log.info("2.Display Customer Details");
		log.info("3.Search Your Details");
		log.info("4.Select the Bike");
       do {
    	   log.info("Enter the choice");
		   choice = sc.nextInt();
    	   switch (choice) {
		case 1:registration.WriteCustomerDetails();
			break;
		case 2:registration.ReadCustomerDetails();
			break;
		case 3:registration.Search();
		    break;
		case 4:log.info("Which Brand do you need?" + "\n" + Dealer.vehicleList);
		String brand = sc.next();
		vehicle.brand(brand);
		log.info("These are the available model" + "\n");
		for (String s : vehicle.vehicleModel1) {
			log.info(s);
		}
		log.info("which model do you want?" + "\n");
		 model = sc.next();
		vehicle.model(model);
			break;
       }
}while(choice<=4);
       {
		System.out.println("No Such Option");
	}

	}
//calling menu method in main method
	public static void main(String[] args) {
		menu();
	}

		
}
