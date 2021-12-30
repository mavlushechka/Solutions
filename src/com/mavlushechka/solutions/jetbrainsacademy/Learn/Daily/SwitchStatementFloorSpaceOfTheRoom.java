package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class SwitchStatementFloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        double square;

        switch (type) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                double perimeter = (a + b + c) / 2;
                square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
            }
            case "rectangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();

                square = a * b;
            }
            case "circle" -> {
                double a = scanner.nextDouble();

                final double pi = 3.14;
                square = pi * a * a;
            }
            default -> square = 0;
        }

        System.out.println(square);
    }
}
