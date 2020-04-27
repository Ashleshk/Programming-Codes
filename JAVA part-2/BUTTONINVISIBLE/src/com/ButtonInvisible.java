package com;
 
import java.awt.*;
import java.awt.event.*;
public class ButtonInvisible extends Frame implements ActionListener
{
  Button redBut, greenBut, blueBut;
  public ButtonInvisible()
  {
    setLayout(new FlowLayout());    
   
    redBut = new Button("Red");
    greenBut = new Button("Green");
    blueBut = new Button("Blue");
 
    redBut.addActionListener(this);
    greenBut.addActionListener(this);
                                  // beautification to buttons
    redBut.setFont(new Font("Monospaced", Font.BOLD, 20));
    greenBut.setFont(new Font("SansSerif", Font.ITALIC, 20));
    blueBut.setFont(new Font("DialogInput", Font.BOLD+Font.ITALIC, 20));
 
    add(redBut); 
    add(greenBut); 
    add(blueBut); 
        
    setTitle("Button Enable Disable");
    setSize(300, 300);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    Object obj = e.getSource();
    Button btn = (Button) obj;
  
    if(btn == redBut)
        blueBut.setVisible(false);
    else if(btn == greenBut)
        blueBut.setVisible(true);
    }
    public static void main(String args[])
    {
      new ButtonInvisible();
    }
}