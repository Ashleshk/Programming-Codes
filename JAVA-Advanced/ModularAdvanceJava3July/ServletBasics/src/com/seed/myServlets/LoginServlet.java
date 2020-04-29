package com.seed.myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver, url, username, pwd;
	Connection con;
	PreparedStatement smt;
	ResultSet rs;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println(config);
		/*
		 * driver = getServletContext().getInitParameter("Driver"); url =
		 * getServletContext().getInitParameter("URL"); username =
		 * getServletContext().getInitParameter("Username"); pwd =
		 * getServletContext().getInitParameter("Password");
		 * 
		 * System.out.println(driver); System.out.println(url);
		 * System.out.println(username); System.out.println(pwd); try {
		 * Class.forName(driver); System.out.println("driver loaded"); con =
		 * DriverManager.getConnection(url, username, pwd);
		 * System.out.println("connection established");
		 */
		/*
		 * } catch (ClassNotFoundException cs) { cs.printStackTrace(); } catch
		 * (SQLException se) { se.printStackTrace(); }
		 */

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		// response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/ProductServlet");
		if (!user.isEmpty() && !pass.isEmpty()) {

			rd.include(request, response);
		} else {
			response.sendRedirect("error.html");
		}
		out.println("Hello");
		// if (!user.isEmpty() && !pass.isEmpty()) {

		/*
		 * try { smt =
		 * con.prepareStatement("select * from login where username =?");
		 * smt.setString(1, user); rs = smt.executeQuery(); while (rs.next()) {
		 * if (rs.getString(1).equals(user) && rs.getString(2).equals(pass)) {
		 * out.println("hello"); } } } catch (SQLException s) {
		 * s.printStackTrace(); } } else {
		 * out.println("Username can not be blank");
		 * 
		 * }
		 */
	}

}
