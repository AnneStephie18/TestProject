package com.ShowRoom;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class ShowRoom {
	public static Scanner sc = new Scanner(System.in);
	public static String model;

	public static void main(String[] args) {
		Registration registration = new Registration();
		Dealer vehicle = new Dealer();
		Logger log = Logger.getLogger(ShowRoom.class.getName());
		int choice;
		
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
		String model = sc.next();
		vehicle.model(model);
			break;
       }
}while(choice<=5);
		System.out.println("No Such Option");
	}

}
