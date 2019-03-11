<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showModels.jsp</title>
</head>
<body>
<%
Enumeration<String> enumeration = request.getAttributeNames();
while(enumeration.hasMoreElements())
{
	String param = enumeration.nextElement();
	if(param.contains("javax.servlet") || param.contains("org.springframework.web")){
		continue;	
	}
	System.out.println(param + ":" + request.getAttribute(param));
	out.println(param + ":" + request.getAttribute(param));
}
out.flush();
%>
</body>
</html>