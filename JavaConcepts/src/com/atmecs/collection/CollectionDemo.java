package com.atmecs.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
	static void display(Collection<?> list)
	{
		for(Object o:list)
		{
			System.out.println(o);
		}
		
	}
	public static void main(String[] args) {
		
		List<Object> userid=new LinkedList();
		userid.add(10);
		userid.add(2);
		userid.add(3);
		userid.add(4);
		userid.add(5);
		userid.add("annne");
		System.out.println("iterator");
		Iterator i=userid.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(" for each");
		CollectionDemo.display(userid);
	}

}
