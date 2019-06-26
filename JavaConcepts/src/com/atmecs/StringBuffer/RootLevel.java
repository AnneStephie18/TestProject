package com.atmecs.StringBuffer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
public class RootLevel {
	public static void main(String[] args) {
		
		 BasicConfigurator.configure();
	      Logger chance = LogManager.getLogger(RootLevel.class.getName()); 
	      Logger logger1 = LogManager.getLogger("Child1");
	      Logger logger1Child = logger1.getLogger("Child1.ChildOfLogger1");
	      Logger loggerGrandChild = LogManager.getLogger("Child1.ChildOfLogger1.GrandChild");
	      ConsoleAppender apppender=new ConsoleAppender();
	    // chance.addAppender(appender);
	        chance.info("sample apppender");
	        chance.info("logger1's full name is " + logger1.getParent().getName());
	        chance.info("logger1Child's full name is " + logger1Child.getParent().getName());
	        chance.info("loggerGrandChild's full name is " + loggerGrandChild.getParent().getName());
	}

}
