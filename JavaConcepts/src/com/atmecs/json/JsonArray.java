package com.atmecs.json;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;

public class JsonArray {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(JsonArray.class);
		JSONArray jsonarray=new JSONArray();
		jsonarray.add("anne");
		jsonarray.add(new Integer(23));
		jsonarray.add(new Double(25000.0));
		log.info(jsonarray);
	}

}
