package com.seed.ResultSetProperties;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.seed.JDBCDemo.DBConnection;

public class ScrollableResultSetDemo {

	Connection con;
	Statement smt;
	ResultSet rs;

	public ScrollableResultSetDemo() {
		try {
			con = DBConnection.getDBConnection();

			smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = smt.executeQuery("select * from employee123");
			// System.out.println("\n forward iteration");
			/*
			 * while (rs.next()) { System.out.println(rs.getInt(1) + "     " +
			 * rs.getString(2) + "       " + rs.getInt(3)); }
			 */
			rs.afterLast();
			System.out.println("\n backward iteration");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));
			}

			System.out.println("\n checking relative");
			rs.beforeFirst();
			rs.relative(3);
			System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));
			rs.relative(-2);
			System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));
			System.out.println("\n checking absolute");
			rs.absolute(4);
			System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));

			rs.absolute(1);
			System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));
			rs.absolute(7);
			System.out.println(rs.getInt(1) + "     " + rs.getString(2) + "       " + rs.getInt(3));
		} catch (SQLException q) {
			q.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ScrollableResultSetDemo();
	}
}
