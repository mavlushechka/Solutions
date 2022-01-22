package com.mavlushechka.solutions.learning;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/mavlushechka/solutions/learning/File.txt");

        for (int i = 0; i < 12; i++) {
            fileOutputStream.write(System.in.read());
        }
        fileOutputStream.close();
    }
}
