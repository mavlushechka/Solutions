package com.mavlushechka.solutions.learning;

public class ThreadsSynchronized {
	public static void main(String[] args) {
		Callme callme = new Callme();
		Caller caller1 = new Caller(callme, "Hello");
		Caller caller2 = new Caller(callme, "Synchronized");
		Caller caller3 = new Caller(callme, "World");
		
		caller1.thread.start();
		caller2.thread.start();
		caller3.thread.start();
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Interrupted.");
		}
		System.out.println();
	}
}

class Caller implements Runnable {
	public final Thread thread;
	public final Callme callme;
	public final String message;

	public Caller(Callme callme, String message) {
		this.thread = new Thread(this);
		this.callme = callme;
		this.message = message;
	}
	
	public void run() {
		callme.call(message);
	}
}
	

class Callme {
	public synchronized void call(String message) {
		System.out.print("[ " + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exception) {
			System.out.println("Interrupted.");
		}
		System.out.print(" ]");
	}
}
