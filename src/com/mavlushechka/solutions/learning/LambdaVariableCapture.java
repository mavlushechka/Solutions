package com.mavlushechka.solutions.learning;

interface MyFunc {
    int func(int n);
}

public class LambdaVariableCapture {
    public static int field = 5;

    public static void main(String[] args) {
        int number = 10;

        MyFunc increaseBy15 = n -> {
            // Variable used in lambda expression should be final or effectively final
            // number = 11;

            return n + number + field;
        };

        System.out.println(increaseBy15.func(8));

        // Variable used in lambda expression should be final or effectively final
        // number = 11;
        field = 6;
    }
}
