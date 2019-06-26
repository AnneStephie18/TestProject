package com.atmecs.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.simple.JSONValue;

public class JsonList {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(JsonList.class);

		List ls=new ArrayList();
		ls.add("anne");
		ls.add(new Integer(23));
		ls.add(new Double(25000.0));
		String jsontext=JSONValue.toJSONString(ls);
		log.info(jsontext);
	}

}
