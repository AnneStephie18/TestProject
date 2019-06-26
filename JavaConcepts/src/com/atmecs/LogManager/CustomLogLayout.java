package com.atmecs.LogManager;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

public class CustomLogLayout extends PatternLayout {
	public String format(LoggingEvent event)
    {

        UserObject user = (UserObject)event.getMessage();

        StringBuffer sb = new StringBuffer();

        String name = user.getName();
        String age= user.getAge();
        String country= user.getCountry();

        sb.append("<user>");
        sb.append("<name>").append(name).append("</name>");
        sb.append("<age>").append(age).append("</age>");
        sb.append("<country>").append(country).append("</country>");
        sb.append("</user>");
        sb.append("\n");

        return sb.toString();        
    }

}
