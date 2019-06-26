package com.atmecs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		
		List<Students> stu=new ArrayList<>();
		stu.add(new Students(1,45));
		stu.add(new Students(2,80));
		stu.add(new Students(3,95));
	Collections.sort(stu);
	
for(Students s : stu)
{
	System.out.println(s);
}
	}

}
class Students implements Comparable<Students>
{
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	int rollno;
	int marks;
	public Students(int rollno, int marks) {
		
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public int compareTo(Students s) {
		
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
	
	
}