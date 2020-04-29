package com.seed.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
	
		Cookie ck = new Cookie("name", name);
		Cookie ck1 = new Cookie("password", pwd);
		response.addCookie(ck);
		response.addCookie(ck1);
		PrintWriter out = response.getWriter();
		out.println("<form action = 'Product'>");
		out.println("Enter text: <input type='text' name = 'product'>");
		out.println("<input type='submit' value='Go'>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
