package com.mavlushechka.solutions.learning;

interface FunctionalInterface {
    boolean compare(int a, int b);
}

interface IndexFinder {
    int findIndexOf(int element, int[] array);
}

public class Lambda {
    public static void main(String[] args) {
        FunctionalInterface equals = (a, b) -> a == b;
        FunctionalInterface greater = (a, b) -> a > b;
        FunctionalInterface lesser = (a, b) -> a < b;

        IndexFinder indexFinder = (a, b) -> {
            for (int index = 0; index < b.length; index++) {
                if (a == b[index]) {
                    return index;
                }
            }
            return -1;
        };

        System.out.println("10 equals 100: \t\t\t" + equals.compare(10, 100));
        System.out.println("10 is greater than 5: \t" + greater.compare(10, 5));
        System.out.println("10 is lesser than 10: \t" + lesser.compare(10, 10));

        int index = indexFinder.findIndexOf(10, new int[]{7, 8, 9, 10});
        System.out.println(index != -1 ? "Index of 10 is " + index + "." : "Element 10 not found.");
    }
}
