package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class TicTacToeWithAI {
    private final char[][] CELLS = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private final Scanner SCANNER = new Scanner(System.in);
    private Player currentPlayer = Player.FIRST;
    private boolean gameFinished;
    private Player winner;

    public void play() {
        System.out.print("Input command: ");
        try {
            executeCommand(SCANNER.nextLine());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Command not found!");
            play();
            return;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Bad parameters!");
            play();
            return;
        }

        if (!gameFinished) {
            showTable();
            while (!gameFinished) {
                try {
                    if (!currentPlayer.isComputer()) {
                        System.out.print("Enter the coordinates: ");
                        String yAndX = SCANNER.nextLine();
                        String y = yAndX.split(" ")[0];
                        String x = yAndX.split(" ")[1];

                        makeMove(y, x);
                    } else {
                        System.out.println("Making move level \"easy\"");
                        computerMakeMove();
                    }
                    showTable();
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("You should enter numbers!");
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } catch (InvalidParameterException invalidParameterException) {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            }
            showWinner();
        }
    }

    private void executeCommand(String command) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        String[] commandAndArguments = command.toUpperCase().split(" ");

        if (Command.valueOf(commandAndArguments[0]) == Command.START) {
            if ("USER".equals(commandAndArguments[1])) {
                Player.FIRST.setComputer(false);
            } else if (ComputerLevel.valueOf(commandAndArguments[1]) == ComputerLevel.EASY) {
                Player.FIRST.setComputer(true);
            }
            if ("USER".equals(commandAndArguments[2])) {
                Player.SECOND.setComputer(false);
            } else if (ComputerLevel.valueOf(commandAndArguments[2]) == ComputerLevel.EASY) {
                Player.SECOND.setComputer(true);
            }
        } else if (Command.valueOf(commandAndArguments[0]) == Command.EXIT) {
            gameFinished = true;
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

    private void makeMove(String y, String x) throws NumberFormatException, ArrayIndexOutOfBoundsException, InvalidParameterException {
        int tempY = Integer.parseInt(y) - 1;
        int tempX = Integer.parseInt(x) - 1;

        if (CELLS[tempY][tempX] != ' ') {
            throw new InvalidParameterException();
        }

        setCell(tempY, tempX);
        setCurrentPlayer();
    }

    private void computerMakeMove() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        String y = String.valueOf(threadLocalRandom.nextInt(1, 4));
        String x = String.valueOf(threadLocalRandom.nextInt(1, 4));

        try {
            makeMove(y, x);
        } catch (InvalidParameterException invalidParameterException) {
            computerMakeMove();
        }
    }

    private void setCurrentPlayer() {
        currentPlayer = Player.FIRST.getMoves() == Player.SECOND.getMoves() ? Player.FIRST : Player.SECOND;
    }

    private void setCell(int y, int x) {
        CELLS[y][x] = currentPlayer.SYMBOL;
        increasePlayerMoves(CELLS[y][x]);
        checkStatusOfGame();
    }

    private void increasePlayerMoves(char player) {
        if (player == Player.FIRST.SYMBOL) {
            Player.FIRST.incrementMoves();
        } else if (player == Player.SECOND.SYMBOL) {
            Player.SECOND.incrementMoves();
        }
    }

    private void checkStatusOfGame() {
        gameFinished = findWinnerInDiagonalLines() || findWinnerInHorizontalLines();
        if (!gameFinished) {
            for (char[] oneLineCells : CELLS) {
                for (char cell : oneLineCells) {
                    if (cell != ' ') {
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
        for (int i = 0; i < 3; i++) {
            if (CELLS[i][0] != ' ' && CELLS[i][0] == CELLS[i][1] && CELLS[i][1] == CELLS[i][2]) {
                winner = Player.FIRST.SYMBOL == CELLS[i][0] ? Player.FIRST : Player.SECOND;
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (CELLS[0][i] != ' ' && CELLS[0][i] == CELLS[1][i] && CELLS[1][i] == CELLS[2][i]) {
                winner = Player.FIRST.SYMBOL == CELLS[0][i] ? Player.FIRST : Player.SECOND;
                return true;
            }
        }
        return false;
    }

    private boolean findWinnerInDiagonalLines() {
        if (CELLS[0][0] != ' ' && CELLS[0][0] == CELLS[1][1] && CELLS[1][1] == CELLS[2][2]) {
            winner = Player.FIRST.SYMBOL == CELLS[0][0] ? Player.FIRST : Player.SECOND;
            return true;
        } else if (CELLS[0][2] != ' ' && CELLS[0][2] == CELLS[1][1] && CELLS[1][1] == CELLS[2][0]) {
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
    private boolean isComputer;
    private int moves;

    Player(char symbol) {
        this.SYMBOL = symbol;
    }

    public void setComputer(boolean isComputer) {
        this.isComputer = isComputer;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void incrementMoves() {
        moves++;
    }

    public int getMoves() {
        return moves;
    }
}

enum Command {
    START, EXIT
}

enum ComputerLevel {
    EASY
}

class TicTacToeWithAIDemo {
    public static void main(String[] args) {
        new TicTacToeWithAI().play();
    }
}
