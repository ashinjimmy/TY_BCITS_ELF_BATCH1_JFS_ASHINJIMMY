package com.bcits.threads;

import javax.swing.plaf.SliderUI;

public class Thread2Test {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Thread2 t2 = new Thread2();
		Thread t3 = new Thread(t2);
		t3.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main ends");
	}

}
