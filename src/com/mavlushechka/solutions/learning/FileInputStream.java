package com.mavlushechka.solutions.learning;

import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream("src/com/mavlushechka/solutions/learning/File.txt");

        for (int i = fileInputStream.read(); i != -1; i = fileInputStream.read()) {
            System.out.print((char) i);
        }

        fileInputStream.close();
    }
}
