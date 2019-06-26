package com.atmecs.LogManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
	static Logger logger = Logger.getLogger(Test.class);
	 
	   public static void main(String[] args) {
	 BasicConfigurator.configure();
	   UserObject obj1 = new UserObject("User1","29","INDIA");
	   UserObject obj2 = new UserObject("User2","32","USA");
	 
	   logger.info(obj1);
	   logger.error(obj2);
	   }
}
	   
