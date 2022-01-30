package com.mavlushechka.solutions.javaabeginnersguide._14._9;

interface StringFunction {
    String function(String string);
}

public class RemoveSpacesFromString {
    public static String changeString(StringFunction stringFunc, String string) {
        return stringFunc.function(string);
    }

    public static void main(String[] args) {
        StringFunction removeSpaces = string -> string.replaceAll(" ", "");
        String string = "Remove spaces from string.";

        System.out.printf("Text before removing spaces:\t%s\n", string);
        string = changeString(removeSpaces, string);
        System.out.printf("Text after removing spaces:\t\t%s\n", string);
    }
}
