package com.mavlushechka.solutions.other;

import java.util.Scanner;

public class ThreadsMinAndMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[scanner.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		MaxFinder maxFinder = new MaxFinder(numbers);
		MinFinder minFinder = new MinFinder(numbers);

		maxFinder.threadJoin();
		minFinder.threadJoin();
		System.out.printf("Max: %s\nMin: %s\n", maxFinder.get(), minFinder.get());
	}
}

abstract class Finder implements Runnable {

	protected Thread thread; 

	protected void find() {
		thread.start();
	}
	
	public abstract void run();
	
	public void threadJoin() {
		try {
			thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Interrupted.");
		}
	}
}

class MaxFinder extends Finder {
	
	private int max;
	
	private final int[] numbers;
	
	public MaxFinder(int[] numbers) {
		this.numbers = numbers;
		thread = new Thread(this);
		find();
	}
	
	@Override
	public void run() {
		max = numbers[0];
		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
		}
	}
	
	public int get() {
		return max;
	}
}

class MinFinder extends Finder {
	
	private int min;
	
	private final int[] numbers;
	
	public MinFinder(int[] numbers) {
		this.numbers = numbers;
		thread = new Thread(this);
		find();
	}
	
	@Override
	public void run() {
		min = numbers[0];
		for (int number : numbers) {
			if (min > number) {
				min = number;
			}
		}
	}
		
	public int get() {
		return min;
	}	
}	
		
