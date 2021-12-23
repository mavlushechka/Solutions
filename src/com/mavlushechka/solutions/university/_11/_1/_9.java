package com.mavlushechka.solutions.university._11._1;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        int size = new Scanner(System.in).nextInt();
        boolean isEven = size % 2 == 0;
        String message = isEven ? "YES" : "NO";

        System.out.println(message);
    }
}
