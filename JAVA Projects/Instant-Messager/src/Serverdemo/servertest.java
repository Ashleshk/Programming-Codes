package Serverdemo;

import javax.swing.JFrame;

public class servertest {
            public static void main(String[] args) {
				Server Jarvis=new Server();
				Jarvis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Jarvis.startRunning();
			}
}
