package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindWritableFiles {
    public static void main(String[] args) {
        try (DirectoryStream<Path> pathDirectoryStream = Files.newDirectoryStream(Path.of("src/com/mavlushechka/solutions/learning/"), Files::isWritable)) {
            for (Path entry : pathDirectoryStream) {
                System.out.println(entry);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
