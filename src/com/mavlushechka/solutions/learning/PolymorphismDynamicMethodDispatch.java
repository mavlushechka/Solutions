package com.mavlushechka.solutions.learning;

public class PolymorphismDynamicMethodDispatch {
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		SecondClass secondClass = new SecondClass();
		ThirdClass thirdClass = new ThirdClass();
		
		FirstClass ref;

		ref = firstClass;
		ref.callMe();

		ref = secondClass;
		ref.callMe();

		ref = thirdClass;
		ref.callMe();
	}
}

class FirstClass {
	public void callMe() {
		System.out.println("FirstClass");
	}
}

class SecondClass extends FirstClass {
	public void callMe() {
		System.out.println("SecondClass");
	}
}

class ThirdClass extends FirstClass {
	public void callMe() {
		System.out.println("ThirdClass");
	}
}
