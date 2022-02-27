package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        int divisorsNumber = new Scanner(System.in).nextInt();

        for (int i = 1; true; i++) {
            int divisorsNumberForI = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorsNumberForI++;
                }
            }
            if (divisorsNumberForI == divisorsNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
