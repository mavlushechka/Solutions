package com.mavlushechka.solutions.codewars._7;

import java.util.function.IntUnaryOperator;

public class JavaFunctionalProgrammingPart3ClosuredForBusiness {
    public static IntUnaryOperator create(int addTo) {
        return (int number) -> number + addTo;
    }
}
