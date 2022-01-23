package com.mavlushechka.solutions.javaabeginnersguide._10_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTextAndReplaceSpacesToHyphensUsingByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/com/mavlushechka/solutions/javaabeginnersguide/_10_7/File.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/mavlushechka/solutions/javaabeginnersguide/_10_7/File (copy).txt");

        for (char character = (char) fileInputStream.read(); (short) character != -1; character = (char) fileInputStream.read()) {
            fileOutputStream.write(character == ' ' ? '-' : character);
        }
        System.out.println("Process completed!");

        fileInputStream.close();
        fileOutputStream.close();
    }
}
