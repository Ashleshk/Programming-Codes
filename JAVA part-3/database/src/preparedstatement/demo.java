package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class demo {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/data1";
		String uname="root";
		String pass= "root";
		
		
		int id=13;
		String name="appoorva";
		
		String query="insert into tt value(?,?)";
		
		 Class.forName("com.mysql.jdbc.Driver");
		Connection     con = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st =  con.prepareStatement(query);
		 st.setInt(1, id);
		 st.setString(2,name);
		  
		 int i = st.executeUpdate();
		
		 
		
		 System.out.println(i+"  row affeceted");
		st.close();
		con.close();
	}
}
