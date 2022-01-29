package com.mavlushechka.solutions.learning;

import java.io.IOException;

interface MyFunc {
    int func(int n);
}

interface ISystemInRead {
    char func() throws IOException;
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
        ISystemInRead iSystemInRead = () -> (char) System.in.read();

        System.out.println(increaseBy15.func(8));
        try {
            System.out.println(iSystemInRead.func());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Variable used in lambda expression should be final or effectively final
        // number = 11;
        field = 6;
    }
}
