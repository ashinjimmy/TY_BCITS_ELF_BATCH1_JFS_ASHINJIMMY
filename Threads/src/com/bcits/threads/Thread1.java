package com.bcits.threads;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread is called...");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);	
			try {
				//				Thread.sleep(1000);
				wait(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
//			public synchronized void leaveMe() {
//				//notify();
//			}
		}
	}
}



                                                                
