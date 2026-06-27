package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/regform")
public class Register extends jakarta.servlet.http.HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		
		String myname= req.getParameter("name1");
		String myemail= req.getParameter("email1");
		String mypass= req.getParameter("pass1");
		String mycity= req.getParameter("city1");
		
		
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/mvc_db";
			String user="postgres";
			String password="root";
			Connection con= DriverManager.getConnection(url,user,password);
			
			String Insert_Query="INSERT INTO student VALUES(?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(Insert_Query);
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mycity);
			
			int count =ps.executeUpdate();
			if(count>0)
			{
				out.println("Registered Successfully");
				RequestDispatcher rd= req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			else
			{
				out.println("Registered Failed");
				RequestDispatcher rd= req.getRequestDispatcher("/register.html");
				rd.include(req, resp); 
			}
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
