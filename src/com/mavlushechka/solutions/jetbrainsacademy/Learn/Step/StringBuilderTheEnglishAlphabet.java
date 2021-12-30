package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class StringBuilderTheEnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder englishAlphabet = new StringBuilder();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            englishAlphabet.append(letter).append(" ");
        }
        englishAlphabet.deleteCharAt(englishAlphabet.length() - 1);
        return englishAlphabet;
    }
}
