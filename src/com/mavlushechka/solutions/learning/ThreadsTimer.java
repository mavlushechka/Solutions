package com.mavlushechka.solutions.learning;

import java.util.Scanner;

public class ThreadsTimer {
	public static void main(String[] args) {
		System.out.print("Enter timer in seconds: ");
		Timer timer = new Timer(new Scanner(System.in).nextInt());
		System.out.println("Timer is started!");
		timer.start();
	}
}

class Timer implements Runnable {
	private final int time;
	private final Thread thread;

	public Timer(int time) {
		this.time = time;
		thread = new Thread(this);
	}
	
	public void start() {
		thread.start();		
	}
	
	public void run() {
		for (int i = time; i >= 0; i--) {
			System.out.print(i != 0 ? i + " " : i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				System.out.println("Interrupted.");
			}
		}
		System.out.println();
	}
}
