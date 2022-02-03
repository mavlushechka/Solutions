package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.security.InvalidParameterException;
import java.util.Scanner;

class TicTacToeWithAI {
    private final int HEIGHT_OF_TABLE = 3;
    private final int WIDTH_OF_TABLE = 3;
    private final char[][] CELLS = new char[HEIGHT_OF_TABLE][WIDTH_OF_TABLE];
    private final Scanner SCANNER = new Scanner(System.in);
    private int firstPlayerMoves;
    private int secondPlayerMoves;
    private boolean gameFinished;
    private Player winner;

    public void play() {
        enterCells();
        showTable();
        makeMove();
        showTable();
        showWinner();
    }

    private void enterCells() {
        String cells;

        System.out.print("Enter the cells: ");
        cells = SCANNER.next();
        for (int i = 0; i < HEIGHT_OF_TABLE; i++) {
            for (int j = 0; j < WIDTH_OF_TABLE; j++) {
                CELLS[i][j] = cells.charAt(i * HEIGHT_OF_TABLE + j);
                increasePlayerMoves(CELLS[i][j]);
            }
        }
    }

    private void increasePlayerMoves(char player) {
        if (player == Player.FIRST.SYMBOL) {
            firstPlayerMoves++;
        } else if (player == Player.SECOND.SYMBOL) {
            secondPlayerMoves++;
        }
    }

    private void showTable() {
        System.out.println("---------");
        for (char[] oneLineCells : CELLS) {
            System.out.print("| ");
            for (char cell : oneLineCells) {
                System.out.printf("%c ", cell);
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    private void makeMove() {
        int y;
        int x;

        System.out.print("Enter the coordinates: ");
        try {
            y = Integer.parseInt(SCANNER.next()) - 1;
            x = Integer.parseInt(SCANNER.next()) - 1;

            if (CELLS[y][x] != '_') {
                throw new InvalidParameterException();
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("You should enter numbers!");
            makeMove();
            return;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Coordinates should be from 1 to 3!");
            makeMove();
            return;
        } catch (InvalidParameterException invalidParameterException) {
            System.out.println("This cell is occupied! Choose another one!");
            makeMove();
            return;
        }
        CELLS[y][x] = firstPlayerMoves == secondPlayerMoves ? Player.FIRST.SYMBOL : Player.SECOND.SYMBOL;
        checkStatusOfGame();
    }

    private void checkStatusOfGame() {
        gameFinished = findWinnerInDiagonalLines() || findWinnerInHorizontalLines();
        if (!gameFinished) {
            for (char[] oneLineCells : CELLS) {
                for (char cell : oneLineCells) {
                    if (cell != '_') {
                        gameFinished = true;
                    } else {
                        gameFinished = false;
                        return;
                    }
                }
            }
        }
    }

    private boolean findWinnerInHorizontalLines() {
        for (int i = 0; i < HEIGHT_OF_TABLE; i++) {
            if (CELLS[i][0] != '_' && CELLS[i][0] == CELLS[i][1] && CELLS[i][1] == CELLS[i][2]) {
                winner = Player.FIRST.SYMBOL == CELLS[i][0] ? Player.FIRST : Player.SECOND;
                return true;
            }
        }
        for (int i = 0; i < WIDTH_OF_TABLE; i++) {
            if (CELLS[i][0] != '_' && CELLS[0][i] == CELLS[1][i] && CELLS[1][i] == CELLS[2][i]) {
                winner = Player.FIRST.SYMBOL == CELLS[i][0] ? Player.FIRST : Player.SECOND;
                return true;
            }
        }
        return false;
    }

    private boolean findWinnerInDiagonalLines() {
        if (CELLS[0][0] != '_' && CELLS[0][0] == CELLS[1][1] && CELLS[1][1] == CELLS[2][2]) {
            winner = Player.FIRST.SYMBOL == CELLS[0][0] ? Player.FIRST : Player.SECOND;
            return true;
        } else if (CELLS[0][2] != '_' && CELLS[0][2] == CELLS[1][1] && CELLS[1][1] == CELLS[2][0]) {
            winner = Player.FIRST.SYMBOL == CELLS[0][2] ? Player.FIRST : Player.SECOND;
            return true;
        }
        return false;
    }

    private void showWinner() {
        if (winner != null) {
            System.out.printf("%c wins\n", winner.SYMBOL);
        } else if (gameFinished) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }
}

enum Player {
    FIRST('X'), SECOND('O');

    public final char SYMBOL;

    Player(char symbol) {
        this.SYMBOL = symbol;
    }
}

class TicTacToeWithAIDemo {
    public static void main(String[] args) {
        new TicTacToeWithAI().play();
    }
}
