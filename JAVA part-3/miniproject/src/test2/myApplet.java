package test2;



import javax.swing.JApplet;

public class myApplet extends JApplet{
 public void init()
 {
	 System.out.println("intit called");
 }
 @Override
	public void start() {
	 System.out.println("start called");
 	}
 @Override
	public void stop() {
	 System.out.println("stop called");

 	}
 @Override
	public void destroy() {
	 System.out.println("destroy called");

 	}
 public static void main(String[] args) {
	new myApplet();
}
}

