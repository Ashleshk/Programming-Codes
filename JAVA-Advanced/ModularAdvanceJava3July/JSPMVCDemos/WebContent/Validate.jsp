<jsp:useBean id="lgnBn" class="com.seed.web.login.LoginBean" scope="request"/>
<jsp:setProperty property="username" name="lgnBn"/>
<jsp:setProperty property="password" name="lgnBn"/>
<%
if(lgnBn.isValid())
{ %>
	<jsp:forward page="/Welcome.jsp">
		<jsp:param name="book1" value="Core Java"/>
		<jsp:param name="book2" value="Learn HTML"/>
	</jsp:forward>
<% }
else
{ %>
	<p>Invalid Login
	<jsp:include page="/Login.jsp"/>
<%}

%>