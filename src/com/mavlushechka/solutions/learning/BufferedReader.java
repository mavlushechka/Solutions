package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));

        for (char character = (char) bufferedReader.read(); character != '.'; character = (char) bufferedReader.read()) {
            System.out.print(character);
        }
        System.out.print(".\n");

        for (String string = bufferedReader.readLine(); !"stop".equalsIgnoreCase(string); string = bufferedReader.readLine()) {
            System.out.println(string);
        }

        bufferedReader.close();
    }
}
