package com.atmecs;

import java.util.Scanner;
import java.util.logging.Logger;

import com.atmecs.Car;
import com.atmecs.OverSpeedException;
import com.atmecs.Vehicle;

public class Ola {
public static Logger LOGGER = Logger.getLogger("InfoLogging");
	
	
	
	public static void main(String[] args) throws InterruptedException  {
		Scanner sc=new Scanner(System.in);
		Vehicle v=new Car();
		Car c=new Car();
		LOGGER.info("Enter Name:");
		String na=sc.next();
		LOGGER.info("Enter Password:");
		String pd=sc.next();
		c.login(na,pd);
		LOGGER.info("Enter Source:  ");
		String src=sc.next();
		LOGGER.info("Enter Destination:  ");
		String dest=sc.next();
		LOGGER.info("Enter Meters:  ");
		int meters=sc.nextInt();
      	c.booking(src,dest,meters);
      	
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
		v.setSpeed(60);Thread.sleep(5000);LOGGER.info("Driver Details");
      	c.driverDetails();Thread.sleep(5000);
		v.drive();	
		v.takeReverse();LOGGER.info("speed:"+v.getSpeed());
		try {
			c.overSpeed(v.getSpeed());
		}
         catch(OverSpeedException e)
		
		{
			e.printStackTrace();
		}
		
		
		
	}

}
