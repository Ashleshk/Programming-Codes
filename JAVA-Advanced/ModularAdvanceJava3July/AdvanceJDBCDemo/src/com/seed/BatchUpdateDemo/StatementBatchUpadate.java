package com.seed.BatchUpdateDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.seed.JDBCDemo.DBConnection;

public class StatementBatchUpadate {

	Connection con;
	Statement smt;
	
	public StatementBatchUpadate(){
		try{
			con = DBConnection.getDBConnection();
			smt = con.createStatement();
			con.setAutoCommit(false);
			smt.addBatch("insert into employee123 values(9, 'Nina', 9500)");
			smt.addBatch("insert into employee123 values(1, 'Nihar', 9000)");
			smt.addBatch("update employee123 set name = 'Rahul' where id = 5");
			smt.addBatch("delete from employee123 where id = 7");
			int arr[]=smt.executeBatch();
			con.commit();
			for(int i : arr){
				System.out.println("Updated row count "+ i);
			}
		}catch(SQLException qw){
			qw.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new StatementBatchUpadate();
	}
}
