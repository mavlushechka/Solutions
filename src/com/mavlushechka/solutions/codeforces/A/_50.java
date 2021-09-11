package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte M = input.nextByte();
        byte N = input.nextByte();
        short result = (short) ((M * N) / 2);
        System.out.print(result);
    }
}
