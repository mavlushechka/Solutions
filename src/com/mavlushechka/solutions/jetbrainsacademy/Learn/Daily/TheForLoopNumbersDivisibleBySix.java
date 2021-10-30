package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class TheForLoopNumbersDivisibleBySix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int sumOfNumbersDivisibleBySix = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            int number = scanner.nextInt();

            if (number % 6 == 0) {
                sumOfNumbersDivisibleBySix += number;
            }
        }
        System.out.println(sumOfNumbersDivisibleBySix);
    }
}
