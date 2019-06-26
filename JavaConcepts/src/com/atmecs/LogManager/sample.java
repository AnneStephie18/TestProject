package com.atmecs.LogManager;

import java.util.Enumeration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class sample {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger log1=LogManager.getLogger("log1");
		Logger log2=LogManager.getLogger("log2");
		Logger log3=LogManager.getLogger("log3");
		log1.info("This is log1");
		log2.info("This is log2");
		log3.info("This is log3");
		Enumeration log=LogManager.getCurrentLoggers();
		while(log.hasMoreElements())
		{
			log1.info("logger name is :"+((Category) log.nextElement()).getName());
		}
		Logger log1_2=LogManager.getLogger("log1");
		Logger log1_3=LogManager.getLogger("log1");
		log1_2.info("the name of the logger is"+log1_2.getName());
		if(log1_3.equals(log1))
		{
			log1_3.info("same");
		}
		else
		{
			log1_3.info("different");
		}
	}

}
