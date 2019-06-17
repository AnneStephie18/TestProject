package com.atmecs;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Logger;
/*
This class is inherited from vehicle class.This perfoms login operation,booking details,check availability,payment details.
*/
public class Car extends Vehicle{
	private static Scanner sc;String b;
	//constructor of this class
	Car()
	{
		super();	
	}
	//Driverdetails is fetched from the file and ready to display whenever it is booked 
	public void driverDetails()
	{
		
		try {
			sc=new Scanner(new File("c:/stephie/DriverDetails.txt"));
		}
		catch(Exception e)
		{
		LOGGER.info("could not find");
		}
		while(sc.hasNext())
		{
			String a=sc.next();
			LOGGER.info(""+a);
		}
		
	}
	//Information about car ie.start/stop
	public void drive()
	{
		if(fuel>0)
		{
			LOGGER.info("Driving and fuel is reduced to"+":"+fuel);
			fuel=fuel-5;
		}
		else
		{
			LOGGER.info("stopped");
		}
		
	}
	//Checking the credentials of the customer
	 void login(String name,String pwd)
	{
		
		 try {
				sc=new Scanner(new File("c:/stephie/demo.txt"));
			}
			catch(Exception e)
			{
			LOGGER.info("could not find");
			}
			while(sc.hasNext())
			{
				 b=sc.next();
				LOGGER.info(""+b);
			}
			
		if(name.length()>2&&pwd.length()>4)
		{
			LOGGER.info("Login Succesful");
		}
		else
		{
			LOGGER.info("Login UnSuccesful");System.exit(0);
			
		}
		
	}
	/*
	By passsing source,destination,kilo meters will check the availability of the car,if within 3m control moves to the available state proceeding with 
	payment details
	*/
	public void booking(String src,String dest,int meters) throws InterruptedException 
	{
		
		if(meters<=3)
		{
			available(0);
		}
		else
		{
			cancel();
			System.exit(0);
		}
		
		
	}
	//On available condition it proceed with payment mode by cash or card
	public void available(int arg) throws InterruptedException 
	{
		
		if(arg==0)
		{
			LOGGER.info("Conform with your payment Details ");
			
		}
		
	}
	public void check() throws InterruptedException 
	{
		
		
		confirm();
		emergency();
			Thread.sleep(5000);
		
	}
		 public  void payment() 
	{
			 LOGGER.info("pay by cash");try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//payment by card
	 public  void payment(long cards) 
	{
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			LOGGER.info("payment Succesful");
	}
	public void confirm()
	{
		LOGGER.info("confirmed");
	}

	public void cancel()
	{
		LOGGER.info("canceled");
	}
	public void emergency()
	{
		LOGGER.info("Contact For Emergency");
	}
}
