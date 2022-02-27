package com.mavlushechka.solutions.university._3._6._1;

class Triangle {
    private final int[] sides = new int[3];
    private int square;
    private int length;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.sides[0] = firstSide;
        this.sides[1] = secondSide;
        this.sides[2] = thirdSide;
        setSquare();
        setLength();
    }

    private void setSquare() {
        this.square = this.sides[0] * this.sides[1] * this.sides[2];
    }

    private void setLength() {
        this.length = this.sides[0] + this.sides[1] + this.sides[2];
    }

    public int getSquare() {
        return square;
    }

    public int getLength() {
        return length;
    }
}

public class _4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 3);
        System.out.println("Square: " + triangle.getSquare()
                + "\nLength: " + triangle.getLength());
    }
}
