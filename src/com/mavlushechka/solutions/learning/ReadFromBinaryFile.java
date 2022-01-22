package com.mavlushechka.solutions.learning;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromBinaryFile {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/com/mavlushechka/solutions/learning/BinaryFile.txt"));

        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());

        dataInputStream.close();
    }
}
