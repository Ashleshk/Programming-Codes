package com.home.SUspend_resume;

 
//Using suspend() and resume().
public class Newthread implements Runnable {
	String name; // name of thread
	Thread t;
	Newthread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}
	//This is the entry point for thread.
	public void run() {
		try {
			for(int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
}
