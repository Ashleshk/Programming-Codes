package check3;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.tools.Tool;


public class JFrame_Icon extends JFrame {

 
  JButton b1 = new JButton("Exit");                                    //ths not working
 
  
 
 
 public static void main(String[] args)
 {
  JFrame_Icon fic = new JFrame_Icon();
  fic.setVisible(true);
  
 }
 public  void Icon(JFrame ht)
 {
 
  setTitle("JFrame Icon");
   
  
  setIconImage(Toolkit.getDefaultToolkit().
    getImage(JFrame_Icon.class.getResource("/ok.png")));
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
}