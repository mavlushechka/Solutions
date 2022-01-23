package com.mavlushechka.solutions.learning;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/com/mavlushechka/solutions/learning/File.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (String text = bufferedReader.readLine(); !text.equalsIgnoreCase("stop"); text = bufferedReader.readLine()) {
            fileWriter.write(text);
        }

        fileWriter.close();
        bufferedReader.close();
    }
}
