package com.home.fileIO2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class inventory {
  static DataInputStream din = new DataInputStream(System.in);
  static StringTokenizer st;
  
  
  @SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException
  { //reading frm console
	DataOutputStream dos = new  DataOutputStream(new FileOutputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO2\\invent.txt"));
	System.out.println("Enter the number:");
	st= new StringTokenizer(din.readLine());
	int code=Integer.parseInt(st.nextToken());
	
	System.out.println("Enter thr number of items:");
	st= new StringTokenizer(din.readLine());
	int items=Integer.parseInt(st.nextToken());
	
	System.out.println("Enter cost:");
	st= new StringTokenizer(din.readLine());
	double cost=new Double(st.nextToken( )).doubleValue();
	
	//writing to the file
	dos.writeInt(code); 
	dos.writeInt(items);
	dos.writeDouble(cost);
	dos.close();
	
	//processing data frm the file
	DataInputStream dis = new DataInputStream(new FileInputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO2\\invent.txt"));
	int codenumber=dis.readInt();
	int totalitems= dis.readInt();
	double itemcost=dis.readDouble();
	double totalcost=totalitems*itemcost;
	dis.close();
	
	//writnig to console
	System.out.println();
	System.out.println("code number;"+codenumber);
	System.out.println("item cost:"+itemcost);
	System.out.println("total items:"+totalitems);
	System.out.println("total cost:"+totalcost);
}
}
