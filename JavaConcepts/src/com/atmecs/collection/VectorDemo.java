package com.atmecs.collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(9);
		v.add(10);
		v.add(10);
		v.add(6);
		v.add(5);
		v.add(10);
		v.add(476);
		v.add(63);
		v.add(10);
		v.add(5756);
		v.add(12340);
		v.add(1350);
		v.add(6);
		v.add(5);
		v.add(10);
		v.add(476);
		v.add(10);
		v.add(476);
		v.add(63);
		v.add(10);
		v.add(5756);
		v.add(12340);
		v.add(1350);
		v.remove(1);
		
		System.out.println(v.capacity()+"\n");
		for(int i:v)
		{
			System.out.println(i);
		}
	}

}
