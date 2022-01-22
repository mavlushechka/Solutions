package com.mavlushechka.solutions.learning;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] array = new byte[10];

        System.out.println(System.in.read(array));
        for (byte element : array) {
            System.out.print((char) element);
        }
    }
}
