package com.book2.multithread;

public class THreadSchedulingdemo extends Thread{
	public THreadSchedulingdemo(String name)
	{
	   super(name);	
	}
		@Override
	    public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		/*	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
	 			e.printStackTrace();
			}*/
		}

		
		
	 }
		public static void main(String[] args) {
			Threaddemo t =new Threaddemo("one");
			t.setPriority(Thread.MAX_PRIORITY);
			t.start();
			Threaddemo t1 =new Threaddemo("tw0");
			t.setPriority(Thread.MIN_PRIORITY);

			t1.start();
		
}
}