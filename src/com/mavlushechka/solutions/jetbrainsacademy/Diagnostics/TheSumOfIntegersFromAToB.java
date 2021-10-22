package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.Scanner;

public class TheSumOfIntegersFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        for (int i = A; i <= B; i++) sum += i;
        System.out.print(sum);
    }
}
