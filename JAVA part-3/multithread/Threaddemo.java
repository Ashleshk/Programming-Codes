package com.book2.multithread;

import sun.applet.Main;

public class Threaddemo  extends Thread{
public Threaddemo(String name)
{
   super(name);	
}
	@Override
    public void run() {
	for(int i=0;i<=10;i++)
	{
		System.out.println(i+" "+Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
 			e.printStackTrace();
		}
	}

	
	
 }
	public static void main(String[] args) {
		Threaddemo t =new Threaddemo("one");
		t.start();
		Threaddemo t1 =new Threaddemo("one");
		t1.start();
	}
	
}
