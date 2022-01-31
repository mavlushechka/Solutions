package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class MultidimensionalArrayRotateARectangleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] rotatedMatrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        for (int[] array : rotatedMatrix) {
            for (int element : array) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}
