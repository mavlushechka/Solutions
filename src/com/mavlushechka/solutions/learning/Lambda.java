package com.mavlushechka.solutions.learning;

interface FunctionalInterface {
    boolean compare(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        FunctionalInterface equals = (a, b) -> a == b;
        FunctionalInterface greater = (a, b) -> a > b;
        FunctionalInterface lesser = (a, b) -> a < b;

        System.out.println("10 equals 100: \t\t\t" + equals.compare(10, 100));
        System.out.println("10 is greater than 5: \t" + greater.compare(10, 5));
        System.out.println("10 is lesser than 10: \t" + lesser.compare(10, 10));
    }
}
