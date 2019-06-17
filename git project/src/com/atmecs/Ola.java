package com.atmecs;

import java.util.Scanner;
import java.util.logging.Logger;

import com.atmecs.Car;
import com.atmecs.OverSpeedException;
import com.atmecs.Vehicle;

public class Ola {
public static Logger LOGGER = Logger.getLogger("InfoLogging");
	
	/* 
	This is the main class which calls method of other class.This project is based on transpotation process,
	in which include customer,driver conversation.
	*/
	
	public static void main(String[] args) throws InterruptedException  {
		Scanner sc=new Scanner(System.in);
		Vehicle v=new Car();
		Car c=new Car();
		//Entering the name of the customer to enter into the page
		LOGGER.info("Enter Name:");
		String na=sc.next();
	       //Entering the password of the customer to enter into the page
		LOGGER.info("Enter Password:");
		String pd=sc.next();
		//calling the method of login which is inside car class
		c.login(na,pd);
		//Entering the source address location
		LOGGER.info("Enter Source:  ");
		String src=sc.next();
		//Entering the destination address location
		LOGGER.info("Enter Destination:  ");
		String dest=sc.next();
		//Entering the source and destination distance into kilo meters 
		LOGGER.info("Enter Meters:  ");
		int meters=sc.nextInt();
		//calling the booking method inside car class
      	        c.booking(src,dest,meters);
      	        //Entering payment mode whether by class/card
		LOGGER.info("Choose Mode of Payment either by 1.cash 2.card:");		
		int ch=sc.nextInt();
		
		switch (ch)
			{
			case 1:
			    c.payment();
			    break;
			case 2:
				LOGGER.info("Enter acccount number:  ");
				long card=sc.nextLong();
		        c.payment(card);
		        break;
			}
		v.setSpeed(60);
		Thread.sleep(5000);
		LOGGER.info("Driver Details");
		//call the method inside car class 
      	        c.driverDetails();
		Thread.sleep(5000);
		//call the method inside car class
		v.drive();	
		v.takeReverse();
		LOGGER.info("speed:"+v.getSpeed());
		try {
			c.overSpeed(v.getSpeed());
		}
                catch(OverSpeedException e)
		
		{
			e.printStackTrace();
		}
		
		
		
	}

}
