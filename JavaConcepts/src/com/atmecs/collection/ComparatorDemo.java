package com.atmecs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Student> stu=new ArrayList<>();
		stu.add(new Student(1,45));
		stu.add(new Student(2,80));
		stu.add(new Student(3,95));
	Collections.sort(stu,(s1,s2)->
	{
		return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
	});
for(Student s : stu)
{
	System.out.println(s);
}
	}	

}
class Student
{
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	int rollno;
	int marks;
	public Student(int rollno, int marks) {
		
		this.rollno = rollno;
		this.marks = marks;
	}
	
	
}
