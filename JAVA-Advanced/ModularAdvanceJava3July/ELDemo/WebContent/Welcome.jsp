<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="pink">

<%! int count; %>

<% 	
	count++;
%>
<p>Dear ${param.username } welcome you are visitor number <%=count %> </p>

<p>Server host is ${header.host} </p>

</body>
</html>