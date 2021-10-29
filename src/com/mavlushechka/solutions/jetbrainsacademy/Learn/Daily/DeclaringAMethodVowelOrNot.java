package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;
import java.util.Set;

public class DeclaringAMethodVowelOrNot {

    private static final Set<Character> VOWEL_LETTERS = Set.of('A', 'E', 'I', 'O', 'U', 'W');

    public static boolean isVowel(char letter) {
        return VOWEL_LETTERS.contains(Character.toUpperCase(letter));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
