package com.mavlushechka.solutions.learning;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/com/mavlushechka/solutions/learning/File.txt");

        for (int i = fileInputStream.read(); i != -1; i = fileInputStream.read()) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
