package com.atmecs;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Logger;
public class Car extends Vehicle{
	private static Scanner sc;String b;
	Car()
	{
		super();	
	}
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