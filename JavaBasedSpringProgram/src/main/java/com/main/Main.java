package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Student;
import com.resources.SpringConfigContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigContext.class);
		
		Student std= (Student) context.getBean("StdId");
		std.display();
		
//		Student std=context.getBean(Student.class);
//		std.display();
		
//		Student std= (Student) context.getBean("StdObj1");
//		std.display();
//		
//		System.out.println("**********************************");
//		
//		
//		Student std1= (Student) context.getBean("StdObj2");
//		std1.display();
		
		
		
		
	}
}
