package com.mavlushechka.solutions.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (char character = (char) bufferedReader.read(); character != '.'; character = (char) bufferedReader.read()) {
            System.out.print(character);
        }
        System.out.print(".\n");

        bufferedReader.close();
    }
}
