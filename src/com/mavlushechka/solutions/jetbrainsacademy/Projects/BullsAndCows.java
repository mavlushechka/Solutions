package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.security.InvalidParameterException;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    private String secretCode;
    private int bulls = 0;
    private int cows = 0;

    public static void main(String[] args) {
        new BullsAndCows().play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int lengthOfSecretCode;
        int numberOfPossibleSymbols;

        System.out.println("Input the length of the secret code:");
        lengthOfSecretCode = scanner.nextInt();
        System.out.println("Input the number of possible symbols in the code:");
        numberOfPossibleSymbols = scanner.nextInt();
        try {
            generateRandomSecretCode(lengthOfSecretCode, numberOfPossibleSymbols);
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
        } catch (InvalidParameterException invalidParameterException) {
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.\n", lengthOfSecretCode);
        }
    }

    private void generateRandomSecretCode(int lengthOfSecretCode, int numberOfPossibleSymbols) {
        if (lengthOfSecretCode > 36) {
            throw new InvalidParameterException();
        } else {
            StringBuilder randomSecretCode = new StringBuilder();
            Random random = new Random();
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
        numberOfPossibleSymbols = numberOfPossibleSymbols > 10 ? numberOfPossibleSymbols - 10 : numberOfPossibleSymbols;
        if (secretCode.length() != 1 && numberOfPossibleSymbols > 1) {
            return String.format("The secret is prepared: %s (0-9, a-%c).", stars, 96 + numberOfPossibleSymbols);
        } else {
            return String.format("The secret is prepared: %s (0-9).", stars);
        }
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
