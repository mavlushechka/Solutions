package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Arrays;

public class ArrayInitializingAnArrayOfLongs {

    public static void main(String[] args) {
        long[] longNumbers = {100_000_000_001L, 100_000_000_002L, 100_000_000_003L};

        System.out.println(Arrays.toString(longNumbers));
    }
}
