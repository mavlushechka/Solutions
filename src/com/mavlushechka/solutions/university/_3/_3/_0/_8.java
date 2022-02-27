package com.mavlushechka.solutions.university._3._3._0;

import java.util.Arrays;

public class _8 {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxNumberIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[maxNumberIndex] < array[j]) {
                    maxNumberIndex = j;
                }
            }
            swap(array, i, maxNumberIndex);
        }
    }

    public static void swap(int[] array, int firstNumberIndex, int secondNumberIndex) {
        int firstNumber = array[firstNumberIndex];
        int secondNumber = array[secondNumberIndex];

        array[firstNumberIndex] = secondNumber;
        array[secondNumberIndex] = firstNumber;
    }

    public static void main(String[] args) {
        int[] array = { 5, 1, 0, 3, 3, 12 };

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
