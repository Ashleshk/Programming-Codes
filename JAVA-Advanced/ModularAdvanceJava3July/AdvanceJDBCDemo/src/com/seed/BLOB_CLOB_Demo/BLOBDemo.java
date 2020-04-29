package com.seed.BLOB_CLOB_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.seed.JDBCDemo.DBConnection;

public class BLOBDemo {
	Connection con;
	PreparedStatement psmt, psmt1;
	ResultSet rs;
	FileInputStream fi;
	FileOutputStream fo;
	File f;

	public BLOBDemo() {
		con = DBConnection.getDBConnection();
		//insertImg();
		retrieveImg();
	}

	private void retrieveImg() {
		File f1 = new File("result.jpg");
		InputStream fi = null;

		try {
			psmt = con.prepareStatement("select * from myImg where id = ?");
			psmt.setInt(1, 102);
			rs = psmt.executeQuery();
			while (rs.next()) {
				fi = rs.getBinaryStream(2);
			}
			fo = new FileOutputStream(f1);
			int i = 0;
			while ((i = fi.read()) != -1) {
				fo.write(i);
			}
			System.out.println("img retrived");
			fo.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private void insertImg() {
		try {
			f = new File("img1.jpg");
			fi = new FileInputStream(f);
			psmt1 = con.prepareStatement("insert into myImg values (?,?)");
			psmt1.setInt(1, 102);
			psmt1.setBinaryStream(2, fi, f.length());
			int i=psmt1.executeUpdate();
			System.out.println("img inserted  "+ i);
		} catch (FileNotFoundException d) {
			d.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new BLOBDemo();
	}

}
