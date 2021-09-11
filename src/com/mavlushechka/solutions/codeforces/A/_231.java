package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n = input.nextShort();
        byte[][] canSolve = new byte[n][3];
        short result = 0;
        for (short i = 0; i < n; i++) {
            short sum = 0;
            for (byte j = 0; j < 3; j++) {
                canSolve[i][j] = input.nextByte();
                sum += canSolve[i][j];
            }
            if (sum > 1) result++;
        }
        System.out.print(result);
    }
}
