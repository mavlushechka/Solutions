package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Arrays;
import java.util.Scanner;

public final class SimpleTicTacToe {

    private static final Scanner scanner = new Scanner(System.in);

    private static final char[][] cells = new char[3][3];

    public static void main(String[] args) {
        enterCells();
        showGrid();
        check();
    }

    private static void enterCells() {
        System.out.print("Enter cells: ");
        char[] oneLineCells = scanner.nextLine().toCharArray();
        for (byte i = 0; i < 3; i++)
            cells[i] = Arrays.copyOfRange(oneLineCells, i*3, i*3+3);
    }

    private static void showGrid() {
        System.out.println("---------");
        for (char[] cell : cells)
            System.out.println("| " + cell[0] + " " + cell[1] + " " + cell[2] + " |");
        System.out.println("---------");
    }

    private static void check() {
        char winner = 0;
        byte numberOfWins = 0;
        byte countOfX = 0;
        byte countOfO = 0;
        boolean gameFinished = !(Arrays.toString(cells[0]).contains("_")
                || Arrays.toString(cells[1]).contains("_")
                || Arrays.toString(cells[2]).contains("_"));
        for (byte i = 0, j = 2; i < 3; i += 2, j -= 2) {
            if (cells[i][0] == cells[1][1] && cells[1][1] == cells[j][2]) {
                gameFinished = true;
                winner = cells[0][0];
                numberOfWins++;
            }
        }
        for (byte i = 0; i < 3; i++) {
            for (byte j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case 'X' -> countOfX++;
                    case 'O' -> countOfO++;
                }
            }
        }
        for (byte i = 0; i < 3; i++) {
            if ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) ||
                    (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i])) {
                gameFinished = true;
                winner = ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2])) ? cells[i][0] : cells[0][i];
                numberOfWins++;
            }
        }

        if (countOfX > countOfO+1 || countOfX+1 < countOfO) {
            System.out.println("Impossible");
        } else if (gameFinished) {
            switch (numberOfWins) {
                case 0 -> System.out.println("Draw");
                case 1 -> System.out.println(winner + " wins");
                default -> System.out.println("Impossible");
            }
        } else {
            System.out.println("Game not finished");
        }
    }
}
