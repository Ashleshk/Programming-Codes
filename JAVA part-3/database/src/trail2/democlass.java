package trail2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
 

import com.mysql.jdbc.Statement;

public class democlass {
      public static void main(String[] args) throws Exception   {
		String url = "jdbc:mysql://localhost:3306/atmdb";
		String uname="root";
		String pass= "root";
		String query="select * from accountdetail ";
		
		int id=8;
		String name="addd";
		String query1="insert into tt values("+id+",'"+name+"')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection     con = DriverManager.getConnection(url,uname,pass);
		System.out.println("connected to database");
		Statement st =(Statement) con.createStatement();
		ResultSet re =st.executeQuery(query);        //DDL   DML   DQL
		//  int i=st.executeUpdate(query1);
		/*
		 * DDL- DATA DEFINATION LLANG  STRUCTURE OF TABLE
		 * DML - DATA   VALUE CHANGE(CHNAGE UPDATE)
		 * DQL - fire query from fetching
		 * TCL - grant permission
		 * */
		
		  //fetch data from database
		String userdata="";
		while(re.next())
		{//String  name=re.getString(2);
	   userdata= (String)(re.getInt(1)+" : "+re.getInt(2)+" : "+re.getInt(3)+" : "+re.getString(4)+" : "+re.getString(5)+" : "+re.getFloat(6)+" : "+ re.getDate(7));
		System.out.println(userdata);
		} 
		
		// System.out.println(i+"  row affeceted");
		st.close();
		con.close();
	}
}
