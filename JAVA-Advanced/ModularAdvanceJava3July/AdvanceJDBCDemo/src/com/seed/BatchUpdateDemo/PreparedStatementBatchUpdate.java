package com.seed.BatchUpdateDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.seed.JDBCDemo.DBConnection;

public class PreparedStatementBatchUpdate {

	Connection con;
	PreparedStatement pst;
	
	public PreparedStatementBatchUpdate(){
		
		try{
			con = DBConnection.getDBConnection();
			pst = con.prepareStatement("insert into employee123 values (?,?,?)");
			con.setAutoCommit(false);
			pst.setInt(1, 10);
			pst.setString(2, "Raj");
			pst.setInt(3, 5000);
			pst.addBatch();
			
			pst.setInt(1, 11);
			pst.setString(2, "Gopi");
			pst.setInt(3, 6000);
			pst.addBatch();
			
			int arr[] = pst.executeBatch();
			con.commit();
			for(int i : arr){
				System.out.println("Updated row count "+ i);
			}
		}catch(SQLException sq){
			sq.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new PreparedStatementBatchUpdate();
	}
}
