package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadInputStream {
    public static void main(String[] args) {
        try (InputStream inputStream = Files.newInputStream(Path.of("src/com/mavlushechka/solutions/learning/File.txt"))) {
            int i;

            do {
                i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
