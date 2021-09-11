package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _791 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short firstBearsWeight = input.nextByte();
        short secondBearsWeight = input.nextByte();
        byte year = 0;
        while (firstBearsWeight <= secondBearsWeight) {
            firstBearsWeight *= 3;
            secondBearsWeight *= 2;
            year++;
        }
        System.out.print(year);
    }
}
