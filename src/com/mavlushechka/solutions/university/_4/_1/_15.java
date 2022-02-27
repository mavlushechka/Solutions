package com.mavlushechka.solutions.university._4._1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        String telephoneNumber = new Scanner(System.in).next();
        List<Integer> absentDigits = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            if (!telephoneNumber.contains(String.valueOf(i))) {
                absentDigits.add(i);
            }
        }

        System.out.println(absentDigits.size());
        absentDigits.forEach(absentDigit -> System.out.printf("%d ", absentDigit));
        System.out.println();
    }
}
