package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _158 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte n = input.nextByte();
        byte k = input.nextByte();
        byte[] a = new byte[n];
        byte result = 0;
        for (byte i = 0; i < n; i++) {
            a[i] = input.nextByte();
        }
        for (byte i = 0; i < n; i++) {
            if (a[i] >= a[k-1] && a[i] != 0) result++;
        }
        System.out.print(result);
    }
}
