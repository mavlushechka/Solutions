package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next().toLowerCase();
        String secondWord = input.next().toLowerCase();
        char[] charactersOfFirstWord = firstWord.toCharArray();
        char[] charactersOfSecondWord = secondWord.toCharArray();
        short sumOfFirstWord = 0;
        short sumOfSecondWord = 0;
        byte result;
        for (byte i = 0; i < firstWord.length(); i++) {
            if ((byte) charactersOfFirstWord[i] != (byte) charactersOfSecondWord[i]) {
                sumOfFirstWord += (byte) charactersOfFirstWord[i];
                sumOfSecondWord += (byte) charactersOfSecondWord[i];
            }
        }
        result = (byte) ((sumOfFirstWord > sumOfSecondWord) ? 1 : -1);
        if (sumOfFirstWord == sumOfSecondWord) result = 0;
        System.out.print(result);
    }
}
