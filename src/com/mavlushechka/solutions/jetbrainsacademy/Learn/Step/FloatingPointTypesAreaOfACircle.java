package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class FloatingPointTypesAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double square = Math.PI * Math.pow(radius, 2);

        System.out.println(square);
    }
}
