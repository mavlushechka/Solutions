package com.mavlushechka.solutions.learning;

public class Interfaces {
	public static void main(String[] args) {
		World world = new World();
		world.print();
		world.printInterfaceInfo();
	}
}

interface HelloWorld {
	String TEXT = "Hello World!";

	void print();

	default void printInterfaceInfo() {
		System.out.println("Interface: HelloWorld");
	}
}

interface ByeWorld {
	/* the following code will not work in A class, because there are two methods with the same name
	default void printInterfaceInfo() {
		System.out.println("Interface: ByeWorld");
	}
	*/
}

class World implements HelloWorld, ByeWorld {
	public void print() {
		System.out.println(TEXT);
	}
}
