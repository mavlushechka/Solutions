package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ProcessingStringsMoveTheFirstNCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        String word = input[0];
        int numberOfFirstCharacters = Integer.parseInt(input[1]);

        if (numberOfFirstCharacters <= word.length()) {
            word = word.substring(numberOfFirstCharacters) + word.substring(0, numberOfFirstCharacters);
        }

        System.out.println(word);
    }
}
