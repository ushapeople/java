 <%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String u= request.getParameter("un");
String p= request.getParameter("pwd");

try 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
	Statement stmt = con.createStatement();
	ResultSet set=stmt.executeQuery("SELECT * FROM `usha`.employee2");
	int flag=0;
	while(set.next())
	{
	 if(u.equals(set.getString(2)) && p.equals(set.getString(3)));
	    {
	      flag=1;
	       break;
		}
	}
	    if(flag==1) 
		{
		 response.sendRedirect("welcome.jsp");
		}
	else
	{
		response.sendRedirect("login.html");
	}
}
catch(Exception e)
{
	
}

%>

</body>
</html>