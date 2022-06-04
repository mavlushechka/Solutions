package com.mavlushechka.solutions.learning;

public class ScannerDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        scanner.close();
    }
}
