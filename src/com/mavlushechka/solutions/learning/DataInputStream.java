package com.mavlushechka.solutions.learning;

import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new FileInputStream("src/com/mavlushechka/solutions/learning/BinaryFile.txt"));

        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());

        dataInputStream.close();
    }
}
