package com.mavlushechka.solutions.learning;

public class LocalVariableTypeInferenceAndInheritance {
	public static A generateObject(int objectId) {
		return switch (objectId) {
			case 1 -> new A();
			case 2 -> new B();
			default -> new C();
		};
	}

	public static void main(String[] args) {
		var object1 = generateObject(1);
		System.out.println(object1.id + " " + object1.getInfo());
		var object2 = generateObject(2);
		System.out.println(object2.id + " " + object2.getInfo());
		var object3 = generateObject(3);
		System.out.println(object3.id + " " + object3.getInfo());
	}
}

class A {

	public int id = 1;

	public String getInfo() {
		return "A";
	}
}

class B extends A {

	public int id = 2;

	public String getInfo() {
		return "B";
	}
}

class C extends B {

	public int id = 3;

	public String getInfo() {
		return "C";
	}
}
