package sound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.audio.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Sound {
public static void main(String[] args) {
	JFrame frame= new JFrame( );
	frame.setSize(200,200);
	JButton button = new JButton("click me");
	
	frame.add(button);
 
    button.addActionListener(new action());
}
public static class action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	 
		 music();
	}
	
}
public static void music()
{
   	//audi 
}
}
