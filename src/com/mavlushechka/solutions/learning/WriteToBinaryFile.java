package com.mavlushechka.solutions.learning;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToBinaryFile {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/com/mavlushechka/solutions/learning/BinaryFile.txt"));

        dataOutputStream.writeInt(18);
        dataOutputStream.writeBoolean(true);

        dataOutputStream.close();
    }
}
