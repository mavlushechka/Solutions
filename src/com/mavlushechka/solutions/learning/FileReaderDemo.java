package com.mavlushechka.solutions.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/mavlushechka/solutions/learning/File.txt"));

        for (String text = bufferedReader.readLine(); text != null; text = bufferedReader.readLine()) {
            System.out.println(text);
        }

        bufferedReader.close();
    }
}
