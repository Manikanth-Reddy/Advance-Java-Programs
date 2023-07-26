<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	a<br>
		${name}<br>
		<%= session.getAttribute("name")%><br>
		${email}<br>
		<%= session.getAttribute("email")%><br>
	<%
	List<Integer> list=(List)session.getAttribute("list");
	int count=1;
	
	for(Integer a:list){
		out.println("The "+count++ +"postion element is"+a);
		%>
		<br>
		<%
		
	}
	%>
</body>
</html>