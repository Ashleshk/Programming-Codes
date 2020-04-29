package trqil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

class c{  
		public static void main(String args[]){ 
			Connection con =null;
			PreparedStatement ps;
			ResultSet rs;
			try
			{
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
			    if(con!=null)
			    {
			    	System.out.println("connected");
			    }
			     
		         
			}
			catch(Exception e)
			{
				System.out.println("failure");
			}
		}
		}
		 
 