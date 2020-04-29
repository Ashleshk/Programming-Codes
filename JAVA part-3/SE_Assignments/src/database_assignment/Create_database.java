package database_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Create_database {
    
   
	Connection con;
	PreparedStatement ps;
	
    String url="jdbc:mysql://localhost:3306/sstudentdata";		
	String uname="root";
	String pwd="root";  //decalred at installation of workbench
	
	public void buildTable(int c) throws SQLException, ClassNotFoundException
	{   
		
		while(c>0)
		{  
			Sub_details s1= new Sub_details();
	      Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);   //this is instanitatiojn of con     ......     getconneciion reserved method for estabblishing connection 
	      System.out.println("Connected to database....");
	     Statement st=(Statement) con.createStatement();
	      ResultSet rs= st.executeQuery("select count(*) from studentdata");      //prevent overlapp of data
	      rs.next();
	      int i=rs.getInt(1);
	      ps=con.prepareStatement("insert into studentdata value(?,?,?,?,?,?,?)");
	      i++;
	      ps.setInt(1, i);
	      ps.setString(2, s1.name);
	      ps.setInt(3, s1.rollno);
	      ps.setString(4, s1.sub);
	      ps.setInt(5,s1.sub_code);
	      ps.setInt(6,s1.internal_marks);
	      ps.setInt(7,s1.univ_marks);
	      int k=ps.executeUpdate();
	      if(k==1)
	      {
	    	  
	    	  System.out.println("table created succesfully");
	      }
	      ps.close();
	      con.close();
		  c--;
		}  
	}
	public   void display() throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);
	      System.out.println("Connected to database....");
	     Statement st=(Statement) con.createStatement();
	      ResultSet rs= st.executeQuery("select * from studentdata");
	      String userdata="";
	      System.out.println("id:  name  : rollno   :  sub : sub-code : int-marks  : univ-marks  "); 
			while(rs.next())
			{ 
		   userdata= (String)(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getString(4)+" : "+rs.getInt(5)+" : "+rs.getInt(6)+" : "+ rs.getInt(7));
				System.out.println(userdata);
			}
			st.close();
		      con.close();
	}
	public void Insert() throws ClassNotFoundException, SQLException
	{		int c;
		  Sub_details s1= new Sub_details();
	      Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);
	      System.out.println("Connected to database....");
	      Statement st=(Statement) con.createStatement();
	      ResultSet rs= st.executeQuery("select count(*) from studentdata");
	      rs.next();
	      int i=rs.getInt(1);
	      ps=con.prepareStatement("insert into studentdata value(?,?,?,?,?,?,?)");
	      i++;
	      ps.setInt(1, i);
	      ps.setString(2, s1.name);
	      ps.setInt(3, s1.rollno);
	      ps.setString(4, s1.sub);
	      ps.setInt(5,s1.sub_code);
	      ps.setInt(6,s1.internal_marks);
	      ps.setInt(7,s1.univ_marks);
	      int k=ps.executeUpdate();
	      if(k==1)
	      {
	    	  
	    	  System.out.println("entry added succesfully");
	      }
	      ps.close();
	      con.close();
	      System.out.println("do you want to continue..(1-yes,else other)");
	      Scanner sc=new Scanner(System.in);
	      c=sc.nextInt();
	      if(c==1)
	      {
	    	  Insert();
	      }
	}
	public void delete(int key) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);
	      System.out.println("Connected to database....");
	      Statement st= (Statement) con.createStatement();
	      int rs = st.executeUpdate("delete from studentdata where id="+key);                 //execute update returns no of rows affected
	      if(rs!=0)
	      {
	    	  System.out.println("the data of sr-no "+key+" has been deleted successfully");
	      }
	      st.close();
	      con.close();
	}
	public void update(int key)throws Exception{
		String NEW_name=null; 
		int new_value=0,c;
		String query = null;
		do {
		System.out.println("What do you want to update:(name,rollno,sub,sub-code,inter-marks,univ-marks) :");
		  Scanner sc=new Scanner(System.in);
		  
		  int k=sc.nextInt();
		  switch(k)
		  {
		  case 1:
		  		{	System.out.println("enter new name:");
		  			  NEW_name=sc.next();
		  			  query="UPDATE `studentdata` SET `name`='"+NEW_name+"' WHERE `id`='"+key+"'";
		  			break;
		  		}
		  case 2:{
			  		System.out.println("Enter new rollno:");
			  		new_value=sc.nextInt();
			  		query="UPDATE `studentdata` SET `rollno`='"+new_value+"' WHERE `id`='"+key+"'";
			  		break;
		  		 }
		  case 3:{
		  		System.out.println("Enter new subject:");
		  		NEW_name=sc.next();
		  		query="UPDATE `studentdata` SET `sub`='"+NEW_name+"' WHERE `id`='"+key+"'";
		  		break;
	  		 }
		  case 4:{
		  		System.out.println("Enter new sub-code:");
		  		new_value=sc.nextInt();
		  		query="UPDATE `studentdata` SET `sub_code`='"+new_value+"' WHERE `id`='"+key+"'";
		  		break;
	  		 }
		  case 5:{
		  		System.out.println("Enter new internal-marks:");
		  		new_value=sc.nextInt();
		  		query="UPDATE `studentdata` SET `internal_marks`='"+new_value+"' WHERE `id`='"+key+"'";
		  		break;
	  		 }
		  case 6:{
		  		System.out.println("Enter new univ-marks:");
		  		new_value=sc.nextInt();query="UPDATE `studentdata` SET `university_marks`='"+new_value+"' WHERE `id`='"+key+"'";
		  		break;
	  		 }
		  }
		Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);
	      System.out.println("Connected to database....");
	      Statement st= (Statement) con.createStatement();
	      int rs = st.executeUpdate(query);                 //execute update returns no of rows affected
	      if(rs!=0)
	      {
	    	  System.out.println("the data of sr-no "+key+" has been updated successfully");
	      }
	      st.close();
	      con.close();
	      System.out.println("press 1 to continue other to terminate");
	        c=sc.nextInt();
		}while(c==1);
	}
	public void search(String str,String key)throws Exception{
		  Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection(url,uname,pwd);
	      System.out.println("Connected to database....");
	      Statement st= (Statement) con.createStatement();
	      ResultSet rs = st.executeQuery("select * from `studentdata` where `"+str+"`="+key);                 //execute update returns no of rows affected
	      if(rs.next())
	      {
	    	  System.out.println("the data of sr-no "+key+" has been found ");
	    	 String userdata= (String)(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getString(4)+" : "+rs.getInt(5)+" : "+rs.getInt(6)+" : "+ rs.getInt(7));
				System.out.println(userdata);
	     
	      }
	      st.close();
	      con.close();
	}
	public static void main(String[] args) throws Exception {
		int ch,c;
	     Scanner scan=new Scanner(System.in);
		Create_database db =new Create_database();
	     System.out.println("MENU\n1.Build a master table\n2.List a table\n3.Insert a new entry\n4.Delete old Entry\n5.Edit an entry\n6.Search for a record\nENTER YOUR CHOCIE:");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1:{ System.out.println("Enter no of entries you want to enter:");
					c=scan.nextInt();
					db.buildTable(c);
				break;
				}
		case 2:{	
				  System.out.println("The Table Entries are:");
				  
				  db.display();
				  break;
				}
		case 3:{
				 db.Insert();
				 break;
				}
		case 4:{
			    System.out.println("enter the sr no whose entry you want to delete:");
			    int key=scan.nextInt();
			    db.delete(key);
				break;
				}
		case 5:{
				System.out.println("whose entry you want to update:");
				int k=scan.nextInt();
				db.update(k);
				break;
				}
		case 6:{
				System.out.println("what do you want to search(id,name,rollno,sub,sub_code,internal_marks,university_marks)");
				String str=scan.next();
				System.out.println("enter what you want to search");
				String str2=scan.next();
				db.search(str,str2);break;
				}
		default: System.out.println("INVALID INPUT.....!");
		
		}
	}
}
