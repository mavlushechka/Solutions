package com.mavlushechka.solutions.learning;

public class Number<T extends java.lang.Number> {
    private final T number;

    public Number(T number) {
        this.number = number;
    }

    public int compareTo(Number<?> otherNumber) {
        if (number.doubleValue() == otherNumber.number.doubleValue()) {
            return 0;
        } else {
            return number.doubleValue() > otherNumber.number.doubleValue() ? 1 : -1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}

class NumberExamples {
    public static void main(String[] args) {
        Number<Integer> integerNumber = new Number<>(1);
        Number<Double> doubleNumber = new Number<>(2.0);

        System.out.println(integerNumber);
        System.out.println(doubleNumber);

        System.out.println(doubleNumber.compareTo(integerNumber));
    }
}