package com.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.Student;
import com.beans.Subject;

@Configuration
public class SpringConfigContext {

	@Bean
	public Student createStdId()
	{
		Student std=new Student();
		std.setId(100);
		std.setName("nitin");
		//std.setAddress(createAddrId());		//Manually inject an object
		//std.setSubjects(createSubId());
		
		return std;
		
	}
	
	@Bean
	public Subject createSubId()
	{
		Subject sub= new Subject();
		
		List<String> subject_list=new ArrayList<String>();
		subject_list.add("Java");
		subject_list.add("SQL");
		subject_list.add("React.js");
		
		sub.setSubjects(subject_list);
		return sub;
		
		
		
	}
	
	@Bean
	public Address createAddrId()
	{
		Address addr= new Address();
		addr.setHouseno(3243);
		addr.setCity("pune");
		addr.setPincode(410504);
		
		
		return addr;
		
	}
	
	
	
	
	
}
