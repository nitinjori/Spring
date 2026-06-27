package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigContext {

	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("org.postgresql.Driver");
		datasource.setUrl("jdbc:postgresql://localhost:5432/Student");
		datasource.setUsername("postgres");
		datasource.setPassword("root");
		
		
		return datasource;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate mynpJdbcTemplate()
	{
		NamedParameterJdbcTemplate npjdbctemplate= new NamedParameterJdbcTemplate(myDataSource());
		
		return npjdbctemplate;
		
		
	}
	
}
