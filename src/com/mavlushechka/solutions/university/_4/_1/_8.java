package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int numberOfStrongPoints = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == min && i > 0) {
                    for (int k = 0; k < i; k++) {
                        if (matrix[k][j] == max) {
                            numberOfStrongPoints++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(numberOfStrongPoints);
    }
}
