package com.mavlushechka.solutions.codewars._7;

import java.util.function.ToDoubleFunction;

public class JavaFunctionalProgrammingPart2MultilineFunctions {
    public static ToDoubleFunction<Triangle> f = (Triangle triangle) -> {
        triangle.setArea((double) 1 / 2 * triangle.base * triangle.height);
        return triangle.getArea();
    };
}

class Triangle {
    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public void setArea(double a) {
        area = a;
    }

    public double getArea() {
        return area;
    }
}