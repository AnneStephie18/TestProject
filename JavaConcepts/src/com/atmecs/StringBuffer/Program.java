package com.atmecs.StringBuffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Program {
	static Logger log=Logger.getLogger("infologging");
	private static Scanner sc;static String a;
	static void openFile()
	{
	try {
		sc=new Scanner(new File("c:/stephie/demo.txt"));
	}
	catch(FileNotFoundException e)
	{
	log.info("could not find");
	}
	}
	static void readFile()
	{
		while(sc.hasNext())
		{
			 a=sc.next();log.info(""+a);
			
		}
	}
	static void closeFile()
	{
		sc.close();
	}
	public static void main(String[] args) {
		
		Logger log=Logger.getLogger("infologging");
		Program.openFile();
		Program.readFile();
		Scanner scan=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		//StringBuffer sb1=new StringBuffer();
		log.info("Enter the pin number");
		String pin=scan.next();
		sb.append(pin);
		log.info(""+sb);
		//sb1.append(a);log.info(""+sb1);
		if(sb.toString().equals(a))
		{
			log.info("validation succesful");
		}
		else
		{
			log.error("Validation Unsuccesful");
		}
		Program.closeFile();
	
	}

}