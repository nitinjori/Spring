package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.Student;

@Configuration
public class SpringConfigContext {
	
	@Bean
	public Address createAddrId()
	{
		Address addr= new Address(2123,"delhi",1245);
		
		
		return addr;
		
	}
	
	@Bean
	public Student createStdId()
	{
		Student std= new Student(101,"nitin",createAddrId());
		
		
		return std;
	}
}
