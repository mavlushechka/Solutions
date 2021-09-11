package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte numberOfVectors = input.nextByte();
        short[] sumOfVectors = new short[3];
        boolean isInBalance;
        for (byte i = 0; i < numberOfVectors; i++) {
            for (byte j = 0; j < 3; j++) {
                sumOfVectors[j] += input.nextByte();
            }
        }
        isInBalance = sumOfVectors[0] == 0 && sumOfVectors[1] == 0 && sumOfVectors[2] == 0;
        System.out.print((isInBalance) ? "YES" : "NO");
    }
}
