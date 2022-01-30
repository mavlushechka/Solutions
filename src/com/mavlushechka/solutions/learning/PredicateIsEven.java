package com.mavlushechka.solutions.learning;

import java.util.function.Predicate;

public class PredicateIsEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        int number = 5;

        if (isEven.test(number)) {
            System.out.printf("%d is even.", number);
        } else {
            System.out.printf("%d is odd.", number);
        }
    }
}
