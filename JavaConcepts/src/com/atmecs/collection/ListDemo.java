package com.atmecs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList();
		ls.add(20);
		ls.add(19);
		ls.add(18);
		ls.add(17);
		ls.add(16);
		ls.add(15);
		
		//Collections.sort(ls);
		ls.add(0,21);
		for(int i:ls)
		{
			System.out.println(i);
		}
		System.out.println("another method to print");
		ls.forEach(System.out::println);
	}

}
