package com.mavlushechka.solutions.javaabeginnersguide._14._6;

interface MyTest {
    boolean testing(int number);
}

public class NumberIsBetween10And20 {
    public static void main(String[] args) {
        MyTest numberIsBetween10And20 = number -> 10 <= number && number <= 20;
        int number = 21;

        if (numberIsBetween10And20.testing(number)) {
            System.out.printf("%d is between 10 and 20.\n", number);
        } else {
            System.out.printf("%d is not between 10 and 20.\n", number);
        }
    }
}
