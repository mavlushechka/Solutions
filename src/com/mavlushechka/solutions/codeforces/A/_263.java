package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _263 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte[][] numbers = new byte[5][5];
        byte[] indexes = new byte[2];
        byte result;
        for (byte i = 0; i < 5; i++) {
            for (byte j = 0; j < 5; j++) {
                numbers[i][j] = input.nextByte();
                if (numbers[i][j] == 1) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        result = (byte) (Math.abs(indexes[0] - 2) + Math.abs(indexes[1] - 2));
        System.out.print(result);
    }
}
