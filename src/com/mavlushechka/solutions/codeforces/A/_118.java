package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] vowels = {'a', 'o', 'y', 'e', 'u', 'i'};
        String word = input.next().toLowerCase();
        char[] result;
        for (char vowel : vowels) {
            word = word.replace(vowel, ' ');
        }
        result = word.replaceAll(" ", "").toCharArray();
        for (char character : result) {
            System.out.print("." + character);
        }
    }
}
