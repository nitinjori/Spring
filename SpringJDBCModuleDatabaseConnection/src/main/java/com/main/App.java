package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Student;
import com.mappers.StudentRowMapper;
import com.resource.SpringConfigContext;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	------------------------------------------Insertion--------------------------------------
//    	int id=103;
//    	String name="Harshal";
//    	int salary=13400;
//    	
//    	
//        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigContext.class);
//        JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
//        
//        String insert_query="INSERT INTO student VALUES(?,?,?)";
//        int count= jdbcTemplate.update(insert_query,id,name,salary);
//        
//        
//        if(count>0)
//        {
//        	System.out.println("insertion sucess");
//        }else {
//        	System.out.println("insertion failed");
//        }
        
//    	--------------------------------------updation--------------------------------------------- 
//    	int id=103;
//    	
//    	int salary=15000;
//    	
//    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigContext.class);
//    	JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
//    	
//    	String update_query="UPDATE student SET salary=? WHERE id=?";
//    	int count=jdbcTemplate.update(update_query ,salary,id);
//    	if(count>0)
//    	{
//    		System.out.println("updation sucess");
//    		
//    	}else
//    	{
//    		System.out.println("updation failed");
//    	}
//    	
    	
    	
//    	----------------------------------Deletion--------------------------------------
//    	int id=103;
//    	
//    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigContext.class);
//    	JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
//    	
//    	String update_query="DELETE FROM student WHERE id=?";
//    	int count=jdbcTemplate.update(update_query ,id);
//    	if(count>0)
//    	{
//    		System.out.println("Deletion sucess");
//    		
//    	}else
//    	{
//    		System.out.println("Deletaion failed");
//    	}
    	
//    	------------------------------------Select operation=-----------------------
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigContext.class);
    	JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
    	
    	String Select_Query="SELECT * FROM student";
    	List<Student> std_list= jdbcTemplate.query(Select_Query, new StudentRowMapper());
    	
    	for(Student std: std_list )
    	{
    		System.out.println("id:"+std.getId());
    		System.out.println("name:"+std.getName());
    		System.out.println("salary"+std.getSalary());
    		System.out.println("-------------");
    	}
    	
    }
}
