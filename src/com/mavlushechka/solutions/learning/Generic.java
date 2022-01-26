package com.mavlushechka.solutions.learning;

public class Generic<T extends Number> {
    private final T number;

    public Generic(T number) {
        this.number = number;
    }

    public int compareTo(Generic<?> otherGeneric) {
        if (number.doubleValue() == otherGeneric.number.doubleValue()) {
            return 0;
        } else {
            return number.doubleValue() > otherGeneric.number.doubleValue() ? 1 : -1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}

class NumberExamples {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] firstArray, V[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(1);
        Generic<Double> doubleGeneric = new Generic<>(2.0);
        Integer[] numbers1 = { 1, 2, 3, 4, 5 };
        Integer[] numbers2 = { 1, 2, 3, 4, 5 };

        System.out.println(integerGeneric);
        System.out.println(doubleGeneric);

        System.out.println(doubleGeneric.compareTo(integerGeneric));
        System.out.println(arraysEqual(numbers1, numbers2));
    }
}