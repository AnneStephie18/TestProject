package com.atmecs.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set s=new HashSet<>();
		s.add(12);
		s.add("anne");
		s.add(10.0);
		s.add('e');
		s.add("anne");
		s.add(12);
		for(Object o:s)
		{
			System.out.println(o);
		}
	}

}
