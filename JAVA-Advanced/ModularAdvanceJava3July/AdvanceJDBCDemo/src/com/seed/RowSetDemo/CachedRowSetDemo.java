package com.seed.RowSetDemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

import com.seed.JDBCDemo.DBConnection;
import com.sun.rowset.CachedRowSetImpl;

public class CachedRowSetDemo { 

	Connection con;
	Statement s;
	ResultSet rs;
	CachedRowSet ch;
	
	public CachedRowSetDemo(){
		
		try {
			
			con = DBConnection.getDBConnection();
			s = con.createStatement();
			s.setMaxRows(10);
			rs = s.executeQuery("select * from employee123");
			ch = new CachedRowSetImpl();
			ch.populate(rs);
			rs.close();
			s.close();
			con.close();
			
			while(ch.next()){
				System.out.println(ch.getInt(1)+"     "+ ch.getString(2)+ "       "+ ch.getInt(3));
			}
			
			while(ch.previous()){
				System.out.println(ch.getInt(1)+"     "+ ch.getString(2)+ "       "+ ch.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new CachedRowSetDemo();
	}
	
}
