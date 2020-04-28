package threadsdemo;

public class testmain {
     public static void main(String[] args) {
		Thread t1 =new Thread(new threaddemo("one"));
		Thread t2 =new Thread(new threaddemo("two"));
		Thread t3 =new Thread(new threaddemo("three"));
		Thread t4 =new Thread(new threaddemo("four"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
