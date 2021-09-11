package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _281 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(word);
    }
}
