package com.mavlushechka.solutions.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        java.io.FileWriter fileWriter = new java.io.FileWriter("src/com/mavlushechka/solutions/learning/File.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (String text = bufferedReader.readLine(); !text.equalsIgnoreCase("stop"); text = bufferedReader.readLine()) {
            fileWriter.write(text + System.lineSeparator());
        }

        fileWriter.close();
        bufferedReader.close();
    }
}
