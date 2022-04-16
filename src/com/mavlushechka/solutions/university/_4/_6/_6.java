package com.mavlushechka.solutions.university._4._6;

import java.util.Arrays;
import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int[] numberOfWays = new int[Math.max(width, length)+1];

        Arrays.fill(numberOfWays, 0, width, 1);
        for (int i = width; i <= length; i++) {
            numberOfWays[i] = numberOfWays[i-1] + numberOfWays[i-width];
        }
        System.out.println(numberOfWays[length]);
    }
}
