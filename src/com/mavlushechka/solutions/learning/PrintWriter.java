package com.mavlushechka.solutions.learning;

public class PrintWriter {
    public static void main(String[] args) {
        java.io.PrintWriter printWriter = new java.io.PrintWriter(System.out, true);
        int number = 18;
        double floatingNumber = 18.18;

        printWriter.println("number: " + number);
        printWriter.println("floatingNumber: " + floatingNumber);
        printWriter.println(number + " + " + floatingNumber + " = " + (number + floatingNumber));

        printWriter.close();
    }
}
