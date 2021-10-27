package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public final class SimpleTicTacToe {

    private final char[][] cells = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    private char currentPlayer = 'X';

    private boolean gameFinished = false;

    private Character winner;

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleTicTacToe simpleTicTacToe = new SimpleTicTacToe();
        simpleTicTacToe.startGame();
    }

    public void startGame() {
        showGrid();
        enterCoordinates();
    }

    private void showGrid() {
        System.out.println("---------");
        for (char[] cell : cells) {
            System.out.println("| " + cell[0] + " " + cell[1] + " " + cell[2] + " |");
        }
        System.out.println("---------");
    }

    private void enterCoordinates() {
        byte y;
        byte x;

        System.out.print("Enter the coordinates: ");
        try {
            String tempCoordinates = scanner.nextLine();
            y = Byte.parseByte(tempCoordinates.split(" ")[0]);
            x = Byte.parseByte(tempCoordinates.split(" ")[1]);
        } catch (Exception exception) {
            System.out.println("You should enter numbers!");
            enterCoordinates();
            return;
        }

        showEnterInfo(y, x);
    }

    private void showEnterInfo(byte y, byte x) {
        if (!((y >= 1 && y <= 3) && (x >= 1 && x <= 3))) {
            System.out.println("Coordinates should be from 1 to 3!");
            enterCoordinates();
        } else if (cells[y-1][x-1] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            enterCoordinates();
        } else {
            cells[y-1][x-1] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

            showGrid();

            checkLines();
            if (!gameFinished) {
                enterCoordinates();
            } else {
                System.out.print(getResult());
            }
        }
    }

    private void checkLines() {
        for (byte i = 0, j = 2; i < 3; i += 2, j -= 2) {
            if (cells[i][0] != ' ' && (cells[i][0] == cells[1][1] && cells[1][1] == cells[j][2])) {
                gameFinished = true;
                winner = cells[i][0];
                break;
            }
        }
        if (gameFinished) {
            return;
        }
        for (byte i = 0; i < 3; i++) {
            if (cells[i][0] != ' ' && ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) ||
                    cells[0][i] != ' ' && (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]))) {
                gameFinished = true;
                winner = ((cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2])) ? cells[i][0] : cells[0][i];
            }
        }
        if (gameFinished) {
            return;
        }
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