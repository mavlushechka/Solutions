package com.mavlushechka.solutions.learning;

public class PolymorphismConstructors {
	public static void main(String[] args) {
		/* Point point = new Point(5);
		Line line = new Line(2, 3);
		Point reducedLine = new Line(3, 7); */
		Box box = new Box();

		/* System.out.println(point.getA());
		System.out.println(line.getA() + " " + line.getB());
		System.out.println(reducedLine.getA()); */
	}
}

class Point {
	protected int a;

	public Point() {
		System.out.println("Initializing Point");
	}

	public Point(int a) {
		System.out.println("Initializing Point");
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

class Line extends Point {
	protected int b;

	public Line() {
		System.out.println("Initializing Line");
	}

	public Line(int a, int b) {
		super(a);
		System.out.println("Initializing Line");
		this.b = b;
	}

	public int getB() {
		return b;
	}
}

class Box extends Line {
	protected int c;
	protected int d;

	public Box() {
		System.out.println("Initializing Box");
	}

	public Box(int a, int b, int c, int d) {
		super(a, b);
		System.out.println("Initializing Box");
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}
}
