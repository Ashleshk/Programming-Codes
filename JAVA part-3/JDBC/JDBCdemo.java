package com.book2.JDBC;

 

import java.sql.*;

import javax.sql.StatementEvent;
public class JDBCdemo {
    public static void main(String[] args) throws Exception {
		String user="root";
		String url = "jdbc:mysql://localhost:3306/sakila";
		String pass= "root";
		
    	Class.forName("com.mysql.jdbc.Drivers");
		System.out.println("the driver jbbc has been loaded");
		
		
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("success");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from category");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+ rs.getString(2));
		}
	}
}
