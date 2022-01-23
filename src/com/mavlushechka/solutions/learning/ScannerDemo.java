package com.mavlushechka.solutions.learning;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        scanner.close();
    }
}
