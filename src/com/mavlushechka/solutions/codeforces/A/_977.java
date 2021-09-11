package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _977 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        byte count = input.nextByte();
        for (byte i = 0; i < count; i++) {
            if (number % 10 == 0) number /= 10;
            else number--;
        }
        System.out.print(number);
    }
}
