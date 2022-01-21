package com.mavlushechka.solutions.learning;

public class PolymorphismVariablesIsNotExists {
	public static void main(String[] args) {
		FirstClassWithX firstClassWithX = new FirstClassWithX();
		SecondClassWithX secondClassWithX = new SecondClassWithX();
		FirstClassWithX ref = new SecondClassWithX();

		System.out.println(firstClassWithX.x);
		System.out.println(secondClassWithX.x);
		System.out.println(ref.x);
	}
}

class FirstClassWithX {
	public int x = 10;
}

class SecondClassWithX extends FirstClassWithX {
	public int x = 20;
}
