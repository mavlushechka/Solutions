package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("src/com/mavlushechka/solutions/learning/File.txt"))) {
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

            for (int i = 0; i < fileChannel.size(); i++) {
                System.out.print((char) mappedByteBuffer.get());
            }
            System.out.println();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
