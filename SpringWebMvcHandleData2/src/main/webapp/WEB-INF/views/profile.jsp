<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome : User</h2>
<h2>Name: ${user.getName()}</h2>
<h2>Email: ${user.getEmail()}</h2>
<h2>PhoneNo: ${user.getPhoneno()}</h2>

</body>
</html>