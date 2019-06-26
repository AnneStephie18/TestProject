package com.atmecs.json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class SampeJson {
	public static void main(String[] args) {
		
	
	JSONObject obj=new JSONObject();    
	Map obj1=new HashMap();
	obj1.put("name","sonoo");    
	  obj1.put("age",new Integer(27));    
	  obj1.put("salary",new Double(600000));   
	  String jsontext=JSONValue.toJSONString(obj1);
	   System.out.print(jsontext);    
	}
}
