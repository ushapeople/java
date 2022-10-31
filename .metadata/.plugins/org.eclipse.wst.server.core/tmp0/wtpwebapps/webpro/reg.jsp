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
String p= request.getParameter("pw");
String a= request.getParameter("add");
int z= Integer.parseInt(request.getParameter("zip"));
try 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
	Statement stmt = con.createStatement();
	String query="insert into employee2(`name`,`password`,`add`,`zip`) values('"+u+"','"+p+"','"+a+"','"+z+"')";
	int i=0;
	i=stmt.executeUpdate(query);
	if(i!=0)
	{
		response.sendRedirect("login.html");
	}
	else
	{
		response.sendRedirect(".html");
	}
}
catch(Exception e)
{
	System.out.println(e);
}


%>

</body>
</html>