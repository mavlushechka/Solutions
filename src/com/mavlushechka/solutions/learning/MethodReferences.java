package com.mavlushechka.solutions.learning;

interface IntPredicate {
    boolean test(int n);
}

class MyIntPredicates {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}

public class MethodReferences {
    public static boolean numberTest(IntPredicate intPredicate, int number) {
        return intPredicate.test(number);
    }

    public static void main(String[] args) {
        int number = 10;

        if (numberTest(MyIntPredicates::isEven, number)) {
            System.out.printf("%d is even.\n", number);
        } else {
            System.out.printf("%d is odd.\n", number);
        }

        if (numberTest(MyIntPredicates::isPositive, number)) {
            System.out.printf("%d is positive.\n", number);
        } else {
            System.out.printf("%d is negative.\n", number);
        }
    }
}
