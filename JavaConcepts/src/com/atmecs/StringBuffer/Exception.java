package com.atmecs.StringBuffer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Exception {
	public static void main(String[] args) {
		
		 BasicConfigurator.configure();
	Logger log=LogManager.getLogger("LoggerParent");
	try
	{
		int x=10/0;
		log.info(""+x);
	}
	catch(ArithmeticException e)
	{
		log.warn("exception occured",e);
	}
  }
}
