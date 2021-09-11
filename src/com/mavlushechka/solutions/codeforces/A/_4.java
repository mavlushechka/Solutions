package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte w = input.nextByte();
        System.out.print((w % 2 == 0 && w / 2 != 1) ? "YES" : "NO");
    }
}
