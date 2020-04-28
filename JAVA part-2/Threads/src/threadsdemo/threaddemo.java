package threadsdemo;

import java.util.Random;

public class threaddemo implements Runnable {
	String name;
	int time;
	Random r= new Random();
	
	public threaddemo(String x) {
		name =x;
		time=r.nextInt(999);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.printf("%s is sleeping for %d\n",name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n",name);
		}
		catch(Exception e) {}
	}

}
