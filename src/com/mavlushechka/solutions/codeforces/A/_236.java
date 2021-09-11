package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _236 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nickname = input.next();
        byte sameChars = 0;
        String textSameChars = "dsa";
        System.out.println(textSameChars.indexOf("l"));
        String result;
        for (byte i = 0; i < nickname.length(); i++) {
            for (byte j = (byte) (i+1); j < nickname.length(); j++) {
                if (nickname.charAt(i) == nickname.charAt(j)) sameChars++;
            }
        }
        sameChars /= 2;
        result = ((nickname.length() - sameChars) % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.print(result);
    }
}
