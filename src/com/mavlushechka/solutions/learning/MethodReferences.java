package com.mavlushechka.solutions.learning;

interface IntPredicate {
    boolean test(int n);
}

class MyIntPredicates {
    public final int x;

    public MyIntPredicates(int x) {
        this.x = x;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isXEqualsTo(int number) {
        return x == number;
    }
}

public class MethodReferences {
    public static boolean numberTest(IntPredicate intPredicate, int number) {
        return intPredicate.test(number);
    }

    public static void main(String[] args) {
        MyIntPredicates myIntPredicates = new MyIntPredicates(10);
        IntPredicate intPredicate = myIntPredicates::isXEqualsTo;
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

        if (numberTest(intPredicate, number)) {
            System.out.printf("%d equals to %d.\n", myIntPredicates.x, number);
        } else {
            System.out.printf("%d not equals to %d.\n", myIntPredicates.x, number);
        }
    }
}
