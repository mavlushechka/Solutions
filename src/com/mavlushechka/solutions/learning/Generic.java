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
    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(1);
        Generic<Double> doubleGeneric = new Generic<>(2.0);

        System.out.println(integerGeneric);
        System.out.println(doubleGeneric);

        System.out.println(doubleGeneric.compareTo(integerGeneric));
    }
}