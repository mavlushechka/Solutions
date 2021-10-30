package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public final class SimpleTicTacToe {

    public static final char FIRST_PLAYER = 'X';

    public static final char SECOND_PLAYER = 'O';

    private final char[][] cells = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    private char currentPlayer = FIRST_PLAYER;

    private boolean gameFinished = false;

    private Character winner;

    public void startGame() {
        showCells();
        enterCell();
    }

    private void showCells() {
        System.out.println("---------");
        for (char[] oneLineCells : cells) {
            System.out.print("| ");
            for (char cell : oneLineCells) {
                System.out.printf("%c ", cell);
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    private void enterCell() {
        byte y;
        byte x;
        String temporaryCoordinates;

        System.out.print("Enter the coordinates: ");
        temporaryCoordinates = new Scanner(System.in).nextLine();
        try {
            y = Byte.parseByte(coordinates.split(" ")[0]);
            x = Byte.parseByte(coordinates.split(" ")[1]);
        } catch (Exception exception) {
            System.out.println("You should enter numbers!");
            enterCell();
            return;
        }

        if (!((y >= 1 && y <= 3) && (x >= 1 && x <= 3))) {
            System.out.println("Coordinates should be from 1 to 3!");
            enterCell();
        } else if (cells[y-1][x-1] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            enterCell();
        } else {
            cells[y-1][x-1] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

            showGrid();

            checkLines();
            if (!gameFinished) {
                enterCell();
            } else {
                System.out.print(getResult());
            }
        }
    }

    private void checkLines() {
        checkDiagonalLines();
        if (gameFinished) {
            return;
        }
        checkVerticalAndHorizontalLines();
        if (gameFinished) {
            return;
        }
        isCellsAreFull();
    }

    private void checkDiagonalLines() {
        for (byte i = 0, j = 2; i < 3; i += 2, j -= 2) {
            if (cells[i][0] != ' ' && (cells[i][0] == cells[1][1] && cells[1][1] == cells[j][2])) {
                gameFinished = true;
                winner = cells[i][0];
                break;
            }
        }
    }

    private void checkVerticalAndHorizontalLines() {
        for (byte i = 0; i < 3; i++) {
            if (cells[i][0] != ' ' && ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) ||
                    cells[0][i] != ' ' && (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]))) {
                gameFinished = true;
                winner = ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2])) ? cells[i][0] : cells[0][i];
            }
        }
    }

    private void isCellsAreFull() {
        for (byte i = 0, fullCells = 9; i < 3; i++) {
            for (byte j = 0; j < 3; j++) {
                if (cells[i][j] != ' ') {
                    fullCells--;
                }
            }
            if (fullCells == 0) {
                gameFinished = true;
            }
        }
    }

    private String getResult() {
        return winner == null ? "Draw" : winner + " wins";
    }
}