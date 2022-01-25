package com.mavlushechka.solutions.javaabeginnersguide._12._4;

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private final int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor trafficLightColor;
    private boolean stop = false;
    private boolean changed = false;

    public TrafficLightSimulator(TrafficLightColor trafficLightColor) {
        this.trafficLightColor = trafficLightColor;
    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(trafficLightColor.getDelay());
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            changeColor();
        }
    }

    public synchronized void waitForColorChange() {
        try {
            while (!changed) {
                wait();
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        changed = false;
    }

    public synchronized TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }

    public synchronized void cancel() {
        stop = true;
    }

    private synchronized void changeColor() {
        if (trafficLightColor.ordinal() + 1 < TrafficLightColor.values().length) {
            trafficLightColor = TrafficLightColor.values()[trafficLightColor.ordinal() + 1];
        } else {
            trafficLightColor = TrafficLightColor.values()[0];
        }

        changed = true;
        notify();
    }
}

class TrafficLight {
    public static void main(String[] args) {
        TrafficLightSimulator trafficLightSimulator = new TrafficLightSimulator(TrafficLightColor.RED);

        new Thread(trafficLightSimulator).start();

        for (int i = 0; i < 9; i++) {
            System.out.println(trafficLightSimulator.getTrafficLightColor());
            trafficLightSimulator.waitForColorChange();
        }

        trafficLightSimulator.cancel();
    }
}