package com.atmecs.thread;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class Comparable {
	public static void main(String[] args) {
		List<Laptop> lap=new ArrayList<>();
		lap.add(new Laptop("DELL",16,800));
		lap.add(new Laptop("APPLE",8,1200));
		lap.add(new Laptop("ACER",12,700));
		
		Collections.sort( lap);
		
		for(Laptop l:lap)
		{
			System.out.println(l);
		}
	}

}
