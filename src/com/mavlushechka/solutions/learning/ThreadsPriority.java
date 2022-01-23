package com.mavlushechka.solutions.learning;

public class ThreadsPriority {
    public static void main(String[] args) throws InterruptedException {
        Counter firstCounter = new Counter(10);
        Counter secondCounter = new Counter(5);
        Counter thirdCounter = new Counter(1);

        firstCounter.thread.join();
        secondCounter.thread.join();
        thirdCounter.thread.join();

        System.out.println("Value of count in thread with 10 priority: " + firstCounter.getCount());
        System.out.println("Value of count in thread with 5 priority: " + secondCounter.getCount());
        System.out.println("Value of count in thread with 1 priority: " + thirdCounter.getCount());
    }
}

class Counter implements Runnable {
    public final Thread thread;
    private static boolean running = true;
    private int count;

    public Counter(int priority) {
        thread = new Thread(this);
        thread.setPriority(priority);
        thread.start();
    }

    public void run() {
        while (running && count < 100_000) {
            count++;
        }
        running = false;
    }

    public int getCount() {
        return count;
    }
}
