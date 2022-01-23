package com.mavlushechka.solutions.learning;

import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream("src/com/mavlushechka/solutions/learning/File.txt");

        for (int i = 0; i < 12; i++) {
            fileOutputStream.write(System.in.read());
        }

        fileOutputStream.close();
    }
}
