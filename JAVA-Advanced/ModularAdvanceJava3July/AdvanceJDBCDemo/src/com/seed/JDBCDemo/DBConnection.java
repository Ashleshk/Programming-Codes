package com.seed.JDBCDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getDBConnection() {
		// 1. Driver loading
		// 2. Connection establishment
		Connection con = null;
		FileInputStream fi=null;
		Properties pr;
		try {
			pr = new Properties();
			fi = new FileInputStream("myProp.properties");
			pr.load(fi);
			
			Class.forName(pr.getProperty("driver"));
			System.out.println("Driver loaded");
			
			con = DriverManager.getConnection(pr.getProperty("url"), pr);
			System.out.println("connection established");
			
			// main protocol
			// sub protocol
			// host
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return con;
	}

}
