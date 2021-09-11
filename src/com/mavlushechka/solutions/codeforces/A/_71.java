package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte n = input.nextByte();
        String[] words = new String[n];
        for (byte i = 0; i < n; i++) {
            words[i] = input.next();
        }
        for (byte i = 0; i < n; i++) {
            if (words[i].length() > 10) {
                String result = "";
                result += words[i].charAt(0);
                result += words[i].length()-2;
                result += words[i].charAt(words[i].length()-1);
                System.out.println(result);
            } else {
                System.out.println(words[i]);
            }
        }
    }
}
