package com.practice.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
		
		Student student1 = applicationContext.getBean("student1", Student.class);
		System.out.println(student);
	}
}
