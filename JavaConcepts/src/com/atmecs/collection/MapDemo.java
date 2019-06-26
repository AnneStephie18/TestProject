package com.atmecs.collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		Map m=new LinkedHashMap();
		m.put("id", 101);
		m.put("name","anne");
		m.put("designation","trainee");
		m.put("salary",25000.0);
		m.put("id", 102);
		m.put("position","trainee");
		System.out.println(m);
		System.out.println(m.get("id"));
		Set<Object> keys=m.keySet();
		for(Object key:keys)
		{
			System.out.println(key+" "+m.get(key));
		}
		Map map=new Hashtable();
		map.put("id", 105);
		map.put("name","banu");
		map.put("designation","hr");
		Set<Object> mapkeys=map.keySet();
		for(Object key:mapkeys)
		{
			System.out.println(key+" "+map.get(key));
		}
	}

}
