package com.mavlushechka.solutions.university._7;

import java.util.Arrays;

public class _9 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 3, 3, 4, 3 };

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(deleteAllElementsEqualLast(array)));
    }

    public static int[] deleteAllElementsEqualLast(int[] array) {
        int[] resultArray;
        int length = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[array.length - 1]) {
                array[i] = Integer.MAX_VALUE;
            } else {
                length++;
            }
        }
        resultArray = new int[length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != Integer.MAX_VALUE) {
                resultArray[j] = array[i];
                j++;
            }
        }
        return resultArray;
    }
}
