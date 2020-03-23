package com.niit.springappdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Book.xml");
		Book book = (Book) context.getBean("myFirstSpringBook");
		System.out.println("ISBN NUMBER:-" + book.getIsbn());
		System.out.println("AUTHOR:-" + book.getAuthor());
		System.out.println("TITLE:-" + book.getTitle().getTitleValue());
		for (Chapter chapter : book.getChapters()) {
			System.out.println(chapter.getTitle().getTitleValue());
			System.out.println(chapter.getNumber());
			System.out.println(chapter.getContent());

		}

	}

}
