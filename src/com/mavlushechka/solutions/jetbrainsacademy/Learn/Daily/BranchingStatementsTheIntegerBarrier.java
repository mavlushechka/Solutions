package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class BranchingStatementsTheIntegerBarrier {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int limit = 1000;
        int sum = 0;

        while (!scanner.hasNext("0")) {
            sum += scanner.nextInt();
            if (sum >= limit) {
                sum -= limit;
                break;
            }
        }
        System.out.println(sum);
    }
}
