package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class SimpleTicTacToe {
    private static final Scanner scanner = new Scanner(System.in);
    private static char[] cells;

    public static void main(String[] args) {
        enterCells();
        showGrid();
    }

    private static void enterCells() {
        System.out.print("Enter cells: ");
        cells = scanner.nextLine().toCharArray();
    }

    private static void showGrid() {
        for (byte i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                System.out.println("---------");
            } else {
                System.out.println("| " + cells[(i-1)*3] + " " + cells[(i-1)*3+1] + " " + cells[(i-1)*3+2] + " |");
            }
        }
    }
}
