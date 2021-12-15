package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class ConditionalStatementChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();

        System.out.println(segments % height * segments % width == 0 && height * width >= segments ? "YES" : "NO");
    }
}
