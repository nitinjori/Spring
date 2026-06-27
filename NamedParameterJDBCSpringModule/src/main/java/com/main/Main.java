package com.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.resource.SpringConfigContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigContext.class);
		NamedParameterJdbcTemplate npjdbctemplate= context.getBean(NamedParameterJdbcTemplate.class);
		
		
		Map<String, Object> map=new HashMap();
		map.put("key_id", 104);
		map.put("key_name", "Sahil");
		map.put("key_salary", 35000);
		
		String Insert_Query="INSERT INTO student VALUES(:key_id, :key_name, :key_salary)";
		int count= npjdbctemplate.update(Insert_Query, map);
		if(count>0)
		{
			System.out.println("Insertion Sucesss");
			
		}
		else
		{
			System.out.println("Insertion Failed");
		}
		
	}
}
