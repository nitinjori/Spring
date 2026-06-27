package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String Config_File_loc="applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(Config_File_loc);
		
		Student std= (Student) context.getBean("StdId");
		std.display();
	}
}
