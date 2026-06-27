<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome</h2>
<% 
	User user= (User)session.getAttribute("session_name");


%>

<h3>Name: <%= user.getName() %></h3>
<h3>Email: <%= user.getEmail() %></h3>
<h3>City: <%= user.getCity() %></h3>

</body>
</html>