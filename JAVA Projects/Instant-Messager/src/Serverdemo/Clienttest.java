package Serverdemo;
import javax.swing.*;

public class Clienttest {
     public static void main(String[] args) {
		Client friday= new Client("127.0.0.1");
		friday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		friday.startRunning();
	}
}
