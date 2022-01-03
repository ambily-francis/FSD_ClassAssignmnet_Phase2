<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<jsp:useBean id="emp" class="advance.java.program.Employee"/>
	<jsp:setProperty property="*" name="emp"/>  
	  
	Record:<br><br>  
	Name : <jsp:getProperty property="username" name="emp"/><br>  
	Password : <jsp:getProperty property="password" name="emp"/><br>  
	Age : <jsp:getProperty property="age" name="emp" /><br> 
	Gender : <jsp:getProperty property="gender" name="emp"/><br>  
	City : <jsp:getProperty property="city" name="emp"/><br>  
	Email : <jsp:getProperty property="email" name="emp" /><br> 
	
	 
<a href="direct.jsp">Using this to logout session</a><br>

<hr>

    <!-- We are on this Page  -->
    
</body>
</html>