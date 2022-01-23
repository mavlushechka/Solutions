package com.mavlushechka.solutions.learning;

public class Abstract {
	public static void main(String[] args) {
		HelloWorldNonAbstract helloWorld = new HelloWorldNonAbstract();
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

class HelloWorldNonAbstract extends HelloWorldAbstract {
	public void showClassInfo() {
		System.out.println("Class: HelloWorldDemo");
	}
}
