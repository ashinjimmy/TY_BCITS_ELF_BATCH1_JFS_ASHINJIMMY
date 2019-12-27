package com.bcits.threads;

public class Thread2 implements Runnable {

	@Override
	public synchronized void run() { // synchronized block should create  when wait() is called
		for(int i =0; i <=4; i++) {
			System.out.println(i);
			try {
//				Thread.sleep(1000); // sleep() can't be interrupted until the given time finishes 
				wait(1000); // can interrupt at any point of time
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
//	




}
