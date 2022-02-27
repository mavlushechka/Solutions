package com.mavlushechka.solutions.university._4._1;

import java.util.Arrays;
import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Arrays.stream(new Scanner(System.in).nextLine().split(" ")).forEach(word -> {
            if (word.toLowerCase().contains("code")) {
                System.out.printf("%s ", word);
            }
        });
        System.out.println();
    }
}
