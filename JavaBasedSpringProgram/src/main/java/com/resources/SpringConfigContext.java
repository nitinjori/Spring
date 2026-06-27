package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
public class SpringConfigContext {

	@Bean
	public Student StdId()
	{
		Student std=new Student();
		std.setName("Nitin Jori");
		std.setRollno(103);
		std.setEmail("jorinitin@gamil.com");
		
		return std;
		
	}
	
	
}
