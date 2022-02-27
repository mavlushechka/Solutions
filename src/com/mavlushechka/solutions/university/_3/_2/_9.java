package com.mavlushechka.solutions.university._3._2;

class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}

public class _9 {
    public static double getAverage(double[] massive) {
        double sum = 0;
        double average;
        for (double element : massive) {
            sum += element;
        }
        average = sum / massive.length;
        return average;
    }

    public static int getIndexOfElement(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates(2, 3);
        System.out.println(coordinates);

        double[] massive = { 1, 2.5, 4 };
        System.out.println("Average of massive is " + _9.getAverage(massive));
    }
}
