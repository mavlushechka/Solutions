package com.mavlushechka.solutions.learning;

public class ThreadsInterCommunication {
	public static void main(String[] args) {
		Message message = new Message();
		Producer producer = new Producer(message);
		Consumer consumer = new Consumer(message);
		
		consumer.thread.start();
		producer.thread.start();
	}
}

class Message {
	private String text;
	
	synchronized public void greet() {
		while (text == null) {
			try {
				wait();
			} catch (InterruptedException exception) {
				System.out.println("Interrupted.");
			}
		}
		
		System.out.println(text);
	}
	
	synchronized public void setText(String text) {
		this.text = text;
		notify();
	}
}

class Producer implements Runnable {
	public Message message;
	public Thread thread;
	
	public Producer(Message message) {
		this.message = message;
		thread = new Thread(this);
	}
	
	public void run() {
		message.setText("Hello World!");
	}
}

class Consumer implements Runnable {
	public Message message;
	public Thread thread;
	
	public Consumer(Message message) {
		this.message = message;
		thread = new Thread(this);
	}
	
	public void run() {
		message.greet();
	}
}
