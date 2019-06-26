package com.atmecs.json;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonExample {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(JsonExample.class);

		String s="{\"NAME\":\"ANNE\",\"AGE\":23,\"SALARY\":25000.0}";
		Object obj=JSONValue.parse(s);
		JSONObject jsontext=(JSONObject)obj;
		String name=(String) jsontext.get("NAME");
		Long age=(Long)jsontext.get("AGE");
		Double salary=(Double)jsontext.get("SALARY");
		log.info("NAME:    "+name+"\n"+"AGE:     "+age+"\n"+"SALARY:  "+salary);
	}

}
