package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Student;
import com.resources.SpringConfigContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigContext.class);
		
		Student std= context.getBean(Student.class);
		std.display();
	}
}
