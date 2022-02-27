package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0, j = 0; j < matrix.length; i++) {
            int sum = 0;

            for (int k = 0; k < matrix[j].length; k++) {
                sum += matrix[j][k];
            }
            for (int k = 0; k < matrix.length; k++) {
                if (j != k) {
                    sum += matrix[k][i];
                }
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (i == matrix.length - 1) {
                i = 0;
                j++;
            }
        }

        System.out.println(maxSum);
    }
}
