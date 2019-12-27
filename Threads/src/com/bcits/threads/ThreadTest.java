package com.bcits.threads;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("Main starts");
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.start();
		sleep(2000);
		t2.start();
		sleep(9000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
//		t1.leaveMe();
//		System.out.println("Main ends");


	}

	private static void sleep(int i) {
		
	}

}
