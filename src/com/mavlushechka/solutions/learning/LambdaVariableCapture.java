package com.mavlushechka.solutions.learning;

interface MyFunc {
    int func(int n);
}

public class LambdaVariableCapture {
    public static void main(String[] args) {
        int number = 10;

        MyFunc increaseBy10 = n -> {
            // Variable used in lambda expression should be final or effectively final
            // number = 11;

            return n + number;
        };

        System.out.println(increaseBy10.func(8));

        // Variable used in lambda expression should be final or effectively final
        // number = 11;
    }
}
