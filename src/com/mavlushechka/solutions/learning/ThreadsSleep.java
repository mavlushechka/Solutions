package com.mavlushechka.solutions.learning;

public class ThreadsSleep {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();

		System.out.println("Thread view: Thread[threadName,priority (5 by default),group]");		
		System.out.println("Current thread: " + thread);

		thread.setName("Main thread");
		System.out.println("After name change: " + thread);

		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(thread);
				Thread.sleep(1000);
			}
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted");
		}
	}
}
