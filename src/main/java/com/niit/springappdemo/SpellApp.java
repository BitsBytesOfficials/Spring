package com.niit.springappdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpellApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spell.xml");
		TextEditor text=(TextEditor)context.getBean("textBean");
		text.spellCheck();
		System.out.println(text.getName());
		
	}

}
