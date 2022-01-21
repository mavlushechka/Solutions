package com.mavlushechka.solutions.learning;

public class ThreadsExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main");
		System.out.print("main threads name is set to Main and");
		mainThread.setPriority(10);
		System.out.println(" priority is set to 10.");

		System.out.println();

		System.out.println("Creating another threads.");
		CustomThread secondThread = new CustomThread("Second");
		CustomThread thirdThread = new CustomThread("Third");

		System.out.println();

		System.out.printf("%s.isAlive(): %b\n", mainThread.getName(), mainThread.isAlive());
		System.out.printf("%s.isAlive(): %b\n", secondThread.thread.getName(), secondThread.thread.isAlive());
		System.out.printf("%s.isAlive(): %b\n", thirdThread.thread.getName(), thirdThread.thread.isAlive());

		System.out.println();

		System.out.printf("%s threads priority is changed from %d", secondThread.thread.getName(), secondThread.thread.getPriority());
		secondThread.thread.setPriority(1);
		System.out.printf(" to %d.\n", secondThread.thread.getPriority());
		System.out.printf("%s threads priority is changed from %d", thirdThread.thread.getName(), thirdThread.thread.getPriority());
		thirdThread.thread.setPriority(5);
		System.out.printf(" to %d.\n", thirdThread.thread.getPriority());


		System.out.println();

		System.out.printf("Starting %s and %s threads.\n", secondThread.thread.getName(), thirdThread.thread.getName());
		secondThread.thread.start();
		thirdThread.thread.start();

		System.out.println();

		System.out.printf("%s thread is alive: %b\n", mainThread.getName(), mainThread.isAlive());
		System.out.printf("%s thread is alive: %b\n", secondThread.thread.getName(), secondThread.thread.isAlive());
		System.out.printf("%s thread is alive: %b\n", thirdThread.thread.getName(), thirdThread.thread.isAlive());

		System.out.println();

		try {
			System.out.printf("%s thread is waiting until %s and %s threads join.\n", mainThread.getName(), secondThread.thread.getName(), thirdThread.thread.getName());
			secondThread.thread.join();
			thirdThread.thread.join();
			System.out.printf("%s and %s threads joined.\n", secondThread.thread.getName(), thirdThread.thread.getName());
		} catch (InterruptedException exception) {
			System.out.printf("%s thread interrupted.\n", mainThread.getName());
		}

		try {
			for (int i = 3; i > 0; i--) {
				System.out.printf("%s thread: %d\n", mainThread.getName(), i);
				Thread.sleep(300);
			}
		} catch (InterruptedException exception) {
			System.out.printf("%s thread interrupted.\n", mainThread.getName());
		}
		System.out.printf("Exiting %s thread.\n", mainThread.getName());
	}
}

class CustomThread implements Runnable {

	Thread thread;

	public CustomThread(String name) {
		thread = new Thread(this, name);
		System.out.printf("%s: %s\n", name, thread);
	}

	public void run() {
		try {
			for (int i = 3; i > 0; i--) {
				System.out.printf("%s thread: %d\n", thread.getName(), i);
				Thread.sleep(500);
			}
		} catch (InterruptedException exception) {
			System.out.printf("%s thread interrupted.\n", thread.getName());
		}
		System.out.printf("Exiting %s thread.\n", thread.getName());
	}
}
