package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    private String secretCode;
    private int numberOfPossibleSymbols;
    private int bulls = 0;
    private int cows = 0;

    public static void main(String[] args) {
        new BullsAndCows().play();
    }

    public void play() {
        try {
            Scanner scanner = new Scanner(System.in);

            generateRandomSecretCode();
            System.out.println(getSecretCode(numberOfPossibleSymbols));
            System.out.println("Okay, let's start a game!");
            for (int i = 1; true; i++) {
                System.out.printf("Turn %d:\n", i);
                check(scanner.next());
                System.out.println(getGrade());
                if (bulls == secretCode.length()) {
                    System.out.println("Congratulations! You guessed the secret code.");
                    return;
                }
            }
        } catch (InputMismatchException | InvalidParameterException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void generateRandomSecretCode() {
        Scanner scanner = new Scanner(System.in);
        String lengthOfSecretCodeTemp;
        int lengthOfSecretCode;

        StringBuilder randomSecretCode = new StringBuilder();
        Random random = new Random();

        System.out.println("Input the length of the secret code:");
        lengthOfSecretCodeTemp = scanner.next();
        try {
            lengthOfSecretCode = Integer.parseInt(lengthOfSecretCodeTemp);
        } catch (NumberFormatException numberFormatException) {
            throw new InputMismatchException(String.format("Error: \"%s\" isn't a valid number.", lengthOfSecretCodeTemp));
        }

        System.out.println("Input the number of possible symbols in the code:");
        numberOfPossibleSymbols = scanner.nextInt();

        if (lengthOfSecretCode == 0 || lengthOfSecretCode > numberOfPossibleSymbols) {
            throw new InvalidParameterException(String.format("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", lengthOfSecretCode, numberOfPossibleSymbols));
        }
        if (lengthOfSecretCode > 36) {
            throw new InvalidParameterException(String.format("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.", lengthOfSecretCode));
        }
        if (numberOfPossibleSymbols > 36) {
            throw new InvalidParameterException("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
        }

        numberOfPossibleSymbols = numberOfPossibleSymbols > 10 ? numberOfPossibleSymbols - 10 : numberOfPossibleSymbols;

        while (randomSecretCode.length() < lengthOfSecretCode) {
            if (lengthOfSecretCode == 1 || randomSecretCode.length() < 10 && randomSecretCode.length() < lengthOfSecretCode - 1) {
                int randomNumber = random.nextInt(10);

                if (!randomSecretCode.toString().contains(String.valueOf(randomNumber))) {
                    randomSecretCode.append(randomNumber);
                }
            } else {
                char randomLetter = (char) (random.nextInt(numberOfPossibleSymbols) + 97);

                if (!randomSecretCode.toString().contains(String.valueOf(randomLetter))) {
                    randomSecretCode.append(randomLetter);
                }
            }
        }
        secretCode = randomSecretCode.toString();
    }

    private void check(String enteredSecretCode) {
        bulls = 0;
        cows = 0;

        for (int i = 0; i < enteredSecretCode.length(); i++) {
            if (secretCode.contains(String.valueOf(enteredSecretCode.charAt(i)))) {
                cows++;
            }
            if (secretCode.charAt(i) == enteredSecretCode.charAt(i)) {
                bulls++;
                cows--;
            }
        }
    }

    private String getSecretCode(int numberOfPossibleSymbols) {
        StringBuilder stars = new StringBuilder();

        stars.append("*".repeat(secretCode.length()));
        if (secretCode.length() != 1 && numberOfPossibleSymbols > 0) {
            return String.format("The secret is prepared: %s (0-9, a-%c).", stars, 96 + numberOfPossibleSymbols);
        }
        return String.format("The secret is prepared: %s (0-9).", stars);
    }

    private String getGrade() {
        StringBuilder grade = new StringBuilder("Grade: ");

        if (bulls > 1 && cows > 1) {
            grade.append(String.format("%d bulls and %d cows.", bulls, cows));
        } else if (bulls > 0 && cows > 0) {
            grade.append(String.format("%d bull and %d cow.", bulls, cows));
        } else if (bulls == 0 && cows == 0) {
            grade.append("None");
        } else {
            if (bulls > 1) {
                grade.append(String.format("%d bulls.", bulls));
            } else if (bulls > 0) {
                grade.append(String.format("%d bull.", bulls));
            }
            if (cows > 1) {
                grade.append(String.format("%d cows.", cows));
            }  else if (cows > 0) {
                grade.append(String.format("%d cow.", cows));
            }
        }

        return grade.toString();
    }
}
