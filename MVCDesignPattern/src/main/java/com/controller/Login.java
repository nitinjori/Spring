package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginfrom")
public class Login extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		
		String myemail= req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		
		try {
			
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/mvc_db";
			String username="postgres";
			String password="root";
			Connection con= DriverManager.getConnection(url,username,password);
			
			String Select_Query="SELECT * FROM student WHERE email=? AND password=?";
			PreparedStatement ps= con.prepareStatement(Select_Query);
			ps.setString(1, myemail);
			ps.setString(2, mypass);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				User user= new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				HttpSession session= req.getSession();
				session.setAttribute("session_name", user);
				
				RequestDispatcher rd= req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
				
				
			}else
			{
				out.println("<h3 Style='color:red'>Email and password didnt match</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
