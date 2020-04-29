<%
String username = request.getParameter("username");
String password = request.getParameter("password");

if(username!=null && password!=null && username.equals("seed") && password.equals("infotech"))
{
	RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
	rd.forward(request, response);
}
else
{
	out.println("<p>Invalid Login</p>");
	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	rd.include(request, response);
}

%>