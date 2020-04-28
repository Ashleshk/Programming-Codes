package test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tabledemo extends JFrame {
	
	JFrame frame;
	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);
    
    
    Connection con;
    public tabledemo() throws ClassNotFoundException, SQLException {
		frame= new JFrame( ); 
		scrlPane.setBounds(100,300,600,190);
  		frame.add(scrlPane);
        tabGrid.setFont(new Font ("Times New Roman",0,15));

   	    model.addColumn("TRDate");
       	model.addColumn("Depositamt");
     	model.addColumn("Withamt");
     	model.addColumn("Balance");
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		System.out.println("connected");
		PreparedStatement ps= con.prepareStatement("select * from  transaction where atmno=1000 and accno=10001");
		ResultSet rs=ps.executeQuery();
		 int r=0;
		 rs.last();
		 while(rs.previous())
	        {
	       model.insertRow(r++,new Object[]{rs.getString(7),rs.getString(4),rs.getString(5),rs.getString(6)});

		     }

		
    	frame.setResizable(false);
    	frame.setSize(500,400);
    	frame.setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new tabledemo();
	} 
}
