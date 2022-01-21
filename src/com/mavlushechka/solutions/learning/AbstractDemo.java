package com.mavlushechka.solutions.learning;

public class AbstractDemo {
	public static void main(String[] args) {
		HelloWorldDemo helloWorld = new HelloWorldDemo();
		System.out.println(helloWorld.getText());
		helloWorld.showClassInfo();
	}
}

abstract class HelloWorldAbstract {
	public final String TEXT = "Hello World!";

	public final String getText() {
		return TEXT;
	}

	public abstract void showClassInfo();
}

class HelloWorldDemo extends HelloWorldAbstract {
	public void showClassInfo() {
		System.out.println("Class: HelloWorldDemo");
	}
}
