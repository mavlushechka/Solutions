package com.mavlushechka.solutions.javaabeginnersguide._10_8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTextAndReplaceSpacesToHyphensUsingCharacterStreams {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("src/com/mavlushechka/solutions/javaabeginnersguide/_10_8/File.txt");
             FileWriter fileWriter = new FileWriter("src/com/mavlushechka/solutions/javaabeginnersguide/_10_8/File (copy).txt")) {
            for (char character = (char) fileReader.read(); (short) character != -1; character = (char) fileReader.read()) {
                fileWriter.write(character == ' ' ? '-' : character);
            }
        }
        System.out.println("Process completed!");
    }
}
