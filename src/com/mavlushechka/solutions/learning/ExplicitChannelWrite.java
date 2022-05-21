package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("src/com/mavlushechka/solutions/learning/File.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte) ('A' + i));
            }
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
