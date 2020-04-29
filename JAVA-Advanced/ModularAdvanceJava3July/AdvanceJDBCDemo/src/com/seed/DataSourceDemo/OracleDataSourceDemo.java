package com.seed.DataSourceDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

public class OracleDataSourceDemo {

	OracleDataSource ds;
	Statement smt;
	Connection con;
	ResultSet rs;

	public OracleDataSourceDemo() {
		try {
			ds = new OracleDataSource();
			ds.setURL("jdbc:oracle:thin:@172.16.10.2:1521:orcl");
			ds.setUser("java");
			ds.setPassword("java");
			con = ds.getConnection();
			smt = con.createStatement();
			rs = smt.executeQuery("select * from employee123");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"    "+ rs.getString(2)+"     "+ rs.getInt(3));
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
		}
	}
public static void main(String[] args) {
	new OracleDataSourceDemo();
}
}
