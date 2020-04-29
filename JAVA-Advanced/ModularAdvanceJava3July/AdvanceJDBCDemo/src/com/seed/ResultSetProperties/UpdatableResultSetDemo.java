package com.seed.ResultSetProperties;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.seed.JDBCDemo.DBConnection;

public class UpdatableResultSetDemo {

	Connection con;
	Statement smt;
	ResultSet rs;
	
	public UpdatableResultSetDemo(){
		try{
			con = DBConnection.getDBConnection();
			smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			rs= smt.executeQuery("select id,name,salary from employee123");
			System.out.println("\n upadation operation");
			rs.absolute(2);
			rs.updateInt("salary", 8000);
			rs.updateRow();
			
			System.out.println("\n insertion operation");
			rs.moveToInsertRow();
			rs.updateInt(1, 8);
			rs.updateString(2, "Ram");
			rs.updateInt(3, 10000);
			rs.insertRow();
			
			System.out.println("\n deletion operation");
			rs.absolute(5);
			rs.deleteRow();
		}catch(SQLException se){
			se.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UpdatableResultSetDemo();
	}
	
}
