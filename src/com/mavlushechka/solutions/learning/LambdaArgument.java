package com.mavlushechka.solutions.learning;

interface StringFunction {
    String function(String string);
}

public class LambdaArgument {
    public static String changeString(StringFunction stringFunction, String string) {
        return stringFunction.function(string);
    }

    public static void main(String[] args) {
        StringFunction reverse = (string) -> {
            StringBuilder reversedString = new StringBuilder();
            char[] letters = string.toCharArray();

            for (int i = letters.length - 1; i >= 0; i--) {
                reversedString.append(letters[i]);
            }

            return reversedString.toString();
        };

        String inputString = "Lambda Expressions Expand Java";
        String outputString;

        System.out.println("Here is input string: " + inputString);

        outputString = changeString(reverse, inputString);
        System.out.println("The string reversed: " + outputString);
        outputString = changeString(string -> string.replace(' ', '-'), inputString);
        System.out.println("The string with spaces replaced: " + outputString);
        outputString = changeString(string -> {
            StringBuilder invertedCase = new StringBuilder();
            char[] letters = string.toCharArray();

            for (char letter : letters) {
                invertedCase.append(Character.isUpperCase(letter) ? Character.toLowerCase(letter) : Character.toUpperCase(letter));
            }

            return invertedCase.toString();
        }, inputString);
        System.out.println("The string in reversed case: " + outputString);
    }
}
