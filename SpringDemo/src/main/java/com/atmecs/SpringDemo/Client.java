package com.atmecs.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.atmecs.SpringDemo.Employee;

public class Client {
	public static void main(String[] args) {
		//object constructed by me
		Employee empl=new Employee();
		empl.setEid(101);
		empl.setEname("kayal");
		empl.setDept("CSE");
		System.out.println("Employee Details: "+empl);
		//spring using beanfactory
		Resource resource=new ClassPathResource("ExampleBean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee e1= (Employee)factory.getBean("emp");
		Employee e2= factory.getBean("emp1", Employee.class);
		System.out.println("Employee Details: "+e1);
		System.out.println("Employee Details: "+e2);
		
		//spring using ApplicationContext
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ExampleBean.xml");
		Employee e11= (Employee)context.getBean("emp");
		Employee e21= context.getBean("emp1", Employee.class);
		System.out.println("Employee Details: "+e11);
		System.out.println("Employee Details: "+e21);
		ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
