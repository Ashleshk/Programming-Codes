package com.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseListener implements ActionListener {

	
	mainClass Main;
	
	public CloseListener(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		
	}



	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
 {
			
			
				Main.frame.setForeground(Color.white);
				int x = 1280, y = 990;
				for (int a =1280,b=990; a>0 && b>0; a-=10,b-=10){
					for(int j=0;j<=0;j++)
					{
						
					}
					
					Main.frame.setLocation((1280-a),(990-b));
					}
				
			Main.frame.dispose();
			}
		}
		
		
	}


