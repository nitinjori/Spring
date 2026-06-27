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
		Address addr= new Address();
		addr.setHouseno(2112);
		addr.setCity("pune");
		addr.setPincode(410504);
		
		return addr;
		
	}
	
	@Bean
	public Student createStdId()
	{
		Student std= new Student();
		std.setId(101);
		std.setName("nitin");
		std.setAddress(createAddrId());
		
		return std;
	}
}
