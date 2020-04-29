<%@ taglib uri="/WEB-INF/Elfun.tld" prefix="n" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Info</title>
</head>
<body bgcolor="orange">
 <form action="Info.jsp">
  <p>Enter Your Name : <input type="text" name="personname"></p>
  <p><input type="submit" value="Submit"> </p>
</form>

<p>Your name in Upper Case is ${n:UPPER(param.personname) } </p>
<p>No of characters in your name are ${n:LENGTH(param.personname) } </p>

</body>
</html>