package com.mavlushechka.solutions.learning;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream {
    public static void main(String[] args) throws IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new FileOutputStream("src/com/mavlushechka/solutions/learning/BinaryFile.txt"));

        dataOutputStream.writeInt(18);
        dataOutputStream.writeInt(19);
        dataOutputStream.writeBoolean(true);

        dataOutputStream.close();
    }
}
