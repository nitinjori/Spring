package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_location="applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(config_location);
		
		Student std= (Student) context.getBean("StdId");
		std.display();
		
		System.out.println("=========================");
		
		Student std1= (Student) context.getBean("StdId1");
		std1.display();
		
	}
}
