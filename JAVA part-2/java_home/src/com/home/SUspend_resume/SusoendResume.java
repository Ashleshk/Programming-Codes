package com.home.SUspend_resume;

class SuspendResume {
	public static void main(String args[]) {
		Newthread ob1 = new Newthread("One");
		Newthread ob2 = new Newthread("Two");
		try {
			Thread.sleep(1000);
			ob1.t.suspend();
			//ob1.mysuspend();//modern ways mysuspenf
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.t.resume();
			//ob1.myresume();  //modern ways myresune
			System.out.println("Resuming thread One");
			ob2.t.suspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		//wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}