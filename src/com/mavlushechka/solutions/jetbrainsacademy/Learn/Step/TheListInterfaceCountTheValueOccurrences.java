package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.List;

public class TheListInterfaceCountTheValueOccurrences {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return getTheSameNumberTimes(elem, list1) == getTheSameNumberTimes(elem, list2);
    }

    private static int getTheSameNumberTimes(int number, List<Integer> list) {
        int theSameNumberTimes = 0;

        for (Integer element : list) {
            if (element == number) {
                theSameNumberTimes++;
            }
        }

        return theSameNumberTimes;
    }
}
