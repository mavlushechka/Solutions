package com.mavlushechka.solutions.learning;

public class TwoSynchronizedMethods {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        ThreadTickTock threadTickTock1 = new ThreadTickTock(tickTock, "Tick");
        ThreadTickTock threadTickTock2 = new ThreadTickTock(tickTock, "Tock");
    }
}

class TickTock {
    public String state;

    synchronized public void tick() {
        System.out.print("Tick ");
        state = "Ticked";

        notify();

        while (state.equals("Ticked")) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    synchronized public void tock() {
        System.out.println("Tock");
        state = "Tocked";

        notify();

        while (state.equals("Tocked")) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}

class ThreadTickTock implements Runnable {
    private final TickTock tickTock;
    private final String type;

    public ThreadTickTock(TickTock tickTock, String type) {
        this.tickTock = tickTock;
        this.type = type;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            if ("Tick".equalsIgnoreCase(type)) {
                tickTock.tick();
            } else if ("Tock".equalsIgnoreCase(type)) {
                tickTock.tock();
            }
        }
    }
}