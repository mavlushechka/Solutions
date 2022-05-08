package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        ByteBuffer byteBuffer = ByteBuffer.allocate(32);

        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(Path.of("src/com/mavlushechka/solutions/learning/File.txt"))) {
            do {
                count = seekableByteChannel.read(byteBuffer);
                if (count != -1) {
                    byteBuffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) byteBuffer.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
