package com.Networking;
import java.net.*;
import java.util.*;
import java.applet.*;
import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.event.*;

public class ashleshsites extends JApplet {
	
	 private HashMap<String,URL> websiteInfo;
	 private ArrayList<String> titles;
	 private JList mainList;
	 
	 //init
	 @Override
	public void init() {
		 websiteInfo=new HashMap<String,URL>();
		 titles= new ArrayList<String>();
		 grabHTMLInfo();
		 
		 add(new JLabel("what wesite do you want to visit"),BorderLayout.NORTH);
		 mainList=new JList(titles.toArray());
		 mainList.addListSelectionListener(
				 new ListSelectionListener() {
					
					 
					public void valueChanged(ListSelectionEvent e) {
						 Object object=mainList.getSelectedValue();
						 URL newDocument=websiteInfo.get(object);
						 AppletContext browser=getAppletContext();
						 browser.showDocument(newDocument);
						 
					}
					
				}
				 
				 );
		 add(new JScrollPane(mainList),BorderLayout.CENTER);
	}

	private void grabHTMLInfo() {
		 String title;
		 String address;
		 URL url;
		 int counter=0;
		 title=getParameter("title"+counter);
		 while(title !=null)
		 {
			 address = getParameter("address"+counter);
			 try {
				url=new URL(address); 
				websiteInfo.put(title, url);
				titles.add(title);
				
			 }
			 catch(MalformedURLException e)
			 {e.printStackTrace();}
			 ++counter;
			 title=getParameter("title"+counter);
		 }
	}
	 
}
