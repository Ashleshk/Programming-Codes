package com.book2.multithread;

public class Runnabledemo implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			/*try {                                                      // hiding try catch give always diffeerent result than the normal thraeaad...
				Thread.sleep(100);
			} catch (InterruptedException e) {
	 			e.printStackTrace();
			}*/
		}
		
	}
	public static void main(String[] args) {
		 Runnabledemo r =new Runnabledemo() ;
		 Thread t1 = new Thread(r, "tim");
		 Thread t2 = new Thread(r, "tom");
		 t1.start();
		 t2.start();
	}

}
