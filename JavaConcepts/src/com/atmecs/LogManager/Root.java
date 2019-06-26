package com.atmecs.LogManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Root {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger log1=LogManager.getLogger("log1");
		Logger log2=LogManager.getLogger("log2");
		Logger log3=LogManager.getLogger("log3");
		log1.info("This is log1");
		log2.info("This is log2");
		log3.info("This is log3");
		Logger rootLogger=LogManager.getRootLogger();
		Logger logroot=log1.getRootLogger();
		if(logroot.equals(rootLogger))
		{
			logroot.info("same");
			logroot.info("name of the root:   "+rootLogger.getName());
		}
		else
		{
			logroot.info("different");
		}
	}

}
