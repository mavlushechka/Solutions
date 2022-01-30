package com.mavlushechka.solutions.javaabeginnersguide._14._7;

interface NumericFunction {
    int solve(int number);
}

public class ComputingFactorial {
    public static void main(String[] args) {
        NumericFunction factorial = number -> {
            int result = 1;

            for (int i = 2; i <= number; i++) {
                result *= i;
            }

            return result;
        };
        int number = 5;

        System.out.printf("Factorial of %d is %d.\n", number, factorial.solve(number));
    }
}
