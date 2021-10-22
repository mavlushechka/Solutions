package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        boolean validTriangle = A + B > C && A + C > B && B + C > A;

        System.out.print(validTriangle ? "YES" : "NO");
    }
}
