package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _266 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size = input.nextByte();
        String colors = input.next();
        byte result = 0;
        for (byte i = 0; i < size-1; i ++) {
            if (colors.charAt(i) == colors.charAt(i + 1)) result++;
        }
        System.out.print(result);
    }
}
