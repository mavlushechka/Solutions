package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        double[] numbers = { 1.1, 2.2, 3.3, 4.4 };
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/com/mavlushechka/solutions/learning/Random.dat", "rw");

        for (double number : numbers) {
            randomAccessFile.writeDouble(number);
        }

        // Since each double value is 8 bytes long, each value starts on an 8-byte boundary.
        // seek to first double
        randomAccessFile.seek(0);
        System.out.println(randomAccessFile.readDouble());
        // seek to second double
        randomAccessFile.seek(8);
        System.out.println(randomAccessFile.readDouble());

        System.out.println();
        for (int i = 0; i < numbers.length * 8; i += 8) {
            randomAccessFile.seek(i);
            System.out.print(randomAccessFile.readDouble() + " ");
        }

        randomAccessFile.close();
    }
}
