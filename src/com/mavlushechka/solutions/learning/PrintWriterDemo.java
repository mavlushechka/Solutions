package com.mavlushechka.solutions.learning;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        int number = 18;
        double floatingNumber = 18.18;

        printWriter.println("number: " + number);
        printWriter.println("floatingNumber: " + floatingNumber);
        printWriter.println(number + " + " + floatingNumber + " = " + (number + floatingNumber));

        printWriter.close();
    }
}
