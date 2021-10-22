package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.Scanner;

public class CheckPrefixIgnoringTheCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char firstLetter = text.toUpperCase().charAt(0);

        System.out.print((firstLetter == 'J'));
    }
}
