package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

/*   DAO   -  data access object  
 * it is good practice to access data from databse through object*/
public class demo {
     public static void main(String[] args) throws Exception {
		  StudentDAO dao = new StudentDAO();
		  Student s= dao.getStudent(1);
		  
		  Student s2 =new Student();
		  s2.id=10;
		  s2.name="samuel";
		  dao.addstudent(s2);
		  System.out.println(s.name);
    	 
	}
    
}
class StudentDAO{
	public Student getStudent(int id)
	{
		
		try {
			String query="select name from tt where id="+id;
			Student s =new Student();
			s.id=id;
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","root");
		    Statement st = (Statement) con.createStatement();
		   ResultSet rs= st.executeQuery(query);
		   rs.next();
		   String name = rs.getString(1);
		    s.name=name;
		   return s;
		
		} catch (Exception e) {
			 
			System.out.println(e);
		}
		return null;
	}

	public void addstudent(Student s2) throws Exception {
		 String query="insert into tt values(?,?)";
		 Class.forName("com.mysql.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","root");
	PreparedStatement pst;
	try
	{
		pst=(PreparedStatement) con.prepareStatement(query);
	   	pst.setInt(1, s2.id);
	   	pst.setString(2, s2.name);
	   	pst.executeUpdate();
	}
	catch(Exception e) {System.out.println(e);}
	
	}
}
class Student
{
	int id;
	String name;
}
