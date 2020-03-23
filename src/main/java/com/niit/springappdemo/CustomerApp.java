package com.niit.springappdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp {
	public static void main(String ... args) {
		try {
ApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
 Customer customer=(Customer)context.getBean("c");
 System.out.println("Customer Name:"+customer.getName());
 System.out.println("Customer Age:-"+customer.getAge());
	}catch(Exception e) {System.out.println(e.getMessage());}
 }
}
